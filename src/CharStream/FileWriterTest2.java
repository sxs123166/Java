package CharStream;

import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest2 {
    public static void main(String[] args) {
       try(
               // 0、创建一个文件字符输出流管道与目标文件相通
               Writer fw = new FileWriter("src/test.txt", true);
               ) {
           // 1、public void write(int c):写一个字符出去
           fw.write('a');
           fw.write(97);
           fw.write('好');
           fw.write("\r\n");

           // 2、public void write(String c)写一个字符出去
           fw.write("星游记");
           fw.write("\r\n");
           // 3、public void write(String c, int pos, int len):写字符的一部分出去
           fw.write("星游记", 0, 2);
           fw.write("\r\n");
           // 4、public void write(char[] buffer):写一个字符数组出去
           char[] buffer = {'星', '游', '记'};
           fw.write(buffer);
           fw.write("\r\n");
           // 5、public void write(char[] buffer, int pos, int len)：写字符数组的一部分
           fw.write(buffer, 0, 2);
           fw.write("\r\n");


       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }

    // 注意点
    @Test
    public static void Test() throws IOException {
        Writer fw = new FileWriter("src/test.txt", true);
        fw.write('a');
        fw.write('a');
        fw.write('a');
        // 字符输出流写出数据后，必须刷新流，或者关闭流，写出去的数据才能生效
        fw.flush(); //刷新流

        fw.close(); //关闭流，关闭流包含刷新操作

    }
}
