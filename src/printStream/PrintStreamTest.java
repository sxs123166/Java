package printStream;

import java.io.*;
import java.nio.charset.Charset;

public class PrintStreamTest {
    public static void main(String[] args) {
        // 打印流就是打印出啥就是啥，比如说97就会是97，而不是'a'
        try(
                // 1.创建一个打印流管道
//                PrintStream ps = new PrintStream("src/test7.txt", Charset.forName("GBK"));
//                PrintStream ps = new PrintStream("src/test7.txt");

//                PrintWriter ps = new PrintWriter("src/test7.txt");
                //追加数据要这么写
                PrintWriter ps = new PrintWriter(new FileOutputStream("src/test7.txt", true));

                ) {
            ps.println(97);
            ps.println('a');
            ps.println("测试");
            ps.println(true);
            ps.println(99.5);

            ps.write(97); // 'a'
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
