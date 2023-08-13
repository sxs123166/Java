package IO_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest3 {
    public static void main(String[] args) throws IOException {
        // 1、一次性读取湾文件的全部字节到一个字节数组中去
        InputStream is = new FileInputStream("src/test2.txt");

//        // 2.准备一个字节数组，大小与文件的大小正好一样大
//        File f = new File("src/test2.txt");
//        long size = f.length();
//        byte[] buffer = new byte[(int) size];

//        int len = is.read(buffer);
//        System.out.println(new String(buffer));
//
//        System.out.println(size);
//        System.out.println(len);

        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
