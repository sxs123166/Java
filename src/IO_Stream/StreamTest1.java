package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamTest1 {
    public static void main(String[] args) throws IOException {
        // 1、创建文件字节输入流管道，与文件接通
        InputStream is = new FileInputStream("src/test.txt");

        // 2。开始读区文件的字节数据
        // public int read(): 每次读区一个字节返回，如果没有数据了，返回-1
//        int b1 = is.read();
//        System.out.println((char) b1);
//
//        int b2 = is.read();
//        System.out.println((char) b2);

        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }
        // 读写数据的性能很差
        // 读取汉字会出现乱码
        // 流使用完之后，必须关闭，释放系统资源
        is.close();
    }
}
