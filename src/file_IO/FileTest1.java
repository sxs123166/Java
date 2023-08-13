package file_IO;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        // 1。创建一个File对象，指代某个具体的文件
        File file = new File("./src/test.txt");
        File file1 = new File("." + File.separator + "src" + File.separator + "test.txt");
        System.out.println(file.length());

        File file2 = new File("./aaa");
        System.out.println(file2.length());
        System.out.println(file2.exists());


    }
}
