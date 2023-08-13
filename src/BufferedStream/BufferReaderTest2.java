package BufferedStream;

import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferReaderTest2 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("src/test.txt");
                BufferedReader br = new BufferedReader(fr);
                ){
//            char[] buffer = new char[3];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                System.out.println(new String(buffer, 0, len));
//            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
