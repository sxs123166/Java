package transformStream;

import java.io.*;

public class OutputStreamWriterTest2 {
    public static void main(String[] args) {
        try (
                //1.创建一个文件字节输出流
                OutputStream os = new FileOutputStream("src/test6.txt");
                // 2.把原始的字节输出流，按照指定的字符集转哈u吃呢个字符输出转换流
                Writer osw = new OutputStreamWriter(os, "GBK");
                // 3.把字符输出流包装成缓冲输出流
                BufferedWriter bw = new BufferedWriter(osw);
                ){
            bw.write("你好");
            bw.write("你好吗？");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
