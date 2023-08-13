package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        // 1、粗昂键一个字节输入流对象代表字节输入流管道与原文件相通
        InputStream is = new FileInputStream("src/test2.txt");

        // 2.开始读取文件中的字节数据，每次读区多个字符
        // 每次读取多个字节到字节数组中去，返回读取的字节苏亮，读取完毕会返回-1
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        String rs = new String(buffer);
//        System.out.println(rs);
//        System.out.println("档次读区的字节数量" + len);

        // 注意：读取多少，倒出多少

        // 使用循环改造
        byte[] buffer = new byte[3];
        int len;
        while ((len = is.read(buffer)) != -1) {
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
        // 性能得到了明显提升
        // 这种方式也无法避免汉字乱码的问题




        is.close();
    }
}
