package transformStream;

import java.io.*;

public class InputStreamReaderTestTest1 {
    public static void main(String[] args) {
        try(
                // 1.得到文件您的原始字节流
                InputStream is = new FileInputStream("src/test5.txt");
                // 2.把原始的字节输入流按照指定的字符集编码转换成字符输入流
                Reader isr = new InputStreamReader(is, "GBK");
                // 3.把字符输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
                ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
