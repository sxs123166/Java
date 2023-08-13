package file_IO;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        //1、public boolean createNewFile():创建一个新文件（文件内容为空），创建成功返回true
        File file = new File("src/test2.txt");
        System.out.println(file.createNewFile());

        // 2.public boolean mkdir(): 用于创建文件夹，注意：只能创建一级文件夹
        File file1 = new File("src/aaa");
        System.out.println(file1.mkdir());
        // 3.public boolean mkdirs():用于创建文件夹，注意：可以创建多级文件夹
        File file2 = new File("src/aaa/bbb/ccc");
        System.out.println(file2.mkdirs());
        // 4。public boolean delete():删除文件，或者空文件，注意：不能删除非空文件夹
        System.out.println(file.delete());
        System.out.println(file1.delete());



    }
}
