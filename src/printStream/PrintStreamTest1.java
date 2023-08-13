package printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest1 {
    public static void main(String[] args) {
        // 打印流的重定向
        System.out.println("老骥伏枥");
        System.out.println("志在千里");

        try (
                PrintStream ps = new PrintStream("src/test7.txt");
                ){
            // 把系统默认的打印流对象改成自己设置的打印流
            System.setOut(ps);

            System.out.println("烈士暮年");
            System.out.println("壮心不已");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
