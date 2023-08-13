package file_IO;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        // 1.public String[] list():获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回
        File file = new File("src");
        String[] names = file.list();
        for (String name : names) {
//            System.out.println(name);
        }

        // 2、public File[] listFiles():（重点）获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回
        File[] files = file.listFiles();
        for (File file1 : files) {
//            System.out.println(file1.getAbsolutePath());
//            file1.delete();
        }

        // 改名
        File f1 = new File("src/aaa/bbb/ccc");
        File[] files1 = f1.listFiles();
        for (File file1 : files1) {
            String name = file1.getName();
            String index = name.substring(0, name.indexOf("-"));
            String lastName = name.substring(name.indexOf("-"));
            file1.renameTo(new File(f1, Integer.valueOf(index) + 18 + lastName));
        }



    }
}
