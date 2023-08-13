package BufferedStream;

import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedWriterTest3 {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("src/test3.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            bw.write('a');
            bw.newLine();
            bw.write(97);
            bw.newLine();
            bw.write('好');
            bw.newLine();

            bw.write("你好");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Test
    public static void test() {

        try (
                Reader fr = new FileReader("src/test4.txt");
                BufferedReader br = new BufferedReader(fr);

                Writer wr = new FileWriter("src/sortedTest4.txt");
                BufferedWriter bw = new BufferedWriter(wr);
        ){
            List<String> list = new ArrayList<>();


            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            // sort默认就是按照首字母进行排序
            Collections.sort(list);

            for (String str : list) {
                bw.write(str);
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
