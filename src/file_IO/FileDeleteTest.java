package file_IO;

import java.io.File;

public class FileDeleteTest {
    public static void main(String[] args) {
        deleteDir(new File("src/FileTest"));
    }

    public static void deleteDir(File file) {
        if (file == null || !file.exists()) {
            return;
        }

        if(file.isFile()) {
            file.delete();
            return;
        }

        // 1、file存在且是一级文件夹。拿里面的一级文件对象
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }

        // 2、这是一个有内容的文件夹，干掉里面的内容，在干掉自己
        for (File file1 : files) {
            if(file1.isFile()) {
                file1.delete();
            }else {
                deleteDir(file1);
            }
        }
        file.delete();
    }

    public static void deleteTest(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }

        if(dir.isFile()) {
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();

        if(files == null || files.length == 0) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            }else {
                deleteTest(file);
            }
        }
        dir.delete();
    }
}
