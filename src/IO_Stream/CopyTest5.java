package IO_Stream;

import org.testng.annotations.Test;

import java.io.*;

public class CopyTest5 {
    public static void main(String[] args) throws IOException {
        // 需求：复制照片
        // 1、创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/test.png");
        // 2、创建一个字节输出流管道与目标文件相通
        OutputStream os = new FileOutputStream("src/testtest.png");
        // 3、创建一个字节数组，负责转移数据源
        byte[] buffer = new byte[1024]; //1KB
        // 4、从字节输入流读取字节数据，写出去到字节输出流中，读多少写多少
        int len; //记录每次读取了多少个字节
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }

        os.close();
        is.close();
    }

    @Test
    public static void test() throws IOException {
        InputStream is = new FileInputStream("src/test.png");
        OutputStream os = new FileOutputStream("src/test2.png");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }

        os.close();
        is.close();
    }
}
