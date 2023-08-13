package file_IO;

import java.io.File;

public class FileSearchTest {
    public static void main(String[] args) {

        searchFile2(new File("src/aaa/bbb/ccc"), "2");
    }

    // 搜索文件
    public static void searchFile(File dir, String name) {
        // 1.把非法的情况都拦住
        if(dir == null || !dir.exists() || dir.isFile()) {
            return;
        }

        // 2、dir不是null，存在， 一定是目录对象
        File[] files = dir.listFiles();

        // 3.判断当前目录对象下是否存在一级文件目录，一级是否可以拿到一级文件对象
        if(files != null && files.length > 0) {
            // 4.遍历全部一级文件对象
            for (File f : files) {
                if (f.isFile()) {
                    // 是文件，判断这个文件名是否是我们要找的
                    if(f.getName().contains(name)) {
                        System.out.println("找到了" + f.getAbsolutePath());
                    }
                } else {
                    // 是文件夹，继续重复这个过程
                    searchFile(f, name);
                }
            }
        }
    }



    public static void searchFile2(File file, String text) {
        if(file == null || !file.exists() || file.isFile()) {
            return;
        }

        File[] files = file.listFiles();

        if(files != null && files.length > 0) {
            for (File file1 : files) {
                if(file1.isFile()) {
                    String fileName = file1.getName();
                    if(fileName.contains(text)) {
                        System.out.println(file1.getAbsolutePath());
                    }
                }else {
                    searchFile2(file1, text);
                }
            }
        }



    }


























}
