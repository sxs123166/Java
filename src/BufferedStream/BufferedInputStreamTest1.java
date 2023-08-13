package BufferedStream;

import java.io.*;

public class BufferedInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        try(
                InputStream is = new FileInputStream("src/test.png");
                // 1、定义一个字节缓冲输入流包装原始的字节输入流
                BufferedInputStream bis = new BufferedInputStream(is, 8192 * 2);

                OutputStream os = new FileOutputStream("src/testb.png");
                // 2、定义一个字节缓冲输出流包装原始的字节输出流
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成");
        }
    }
}
