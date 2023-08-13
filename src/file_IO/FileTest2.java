package file_IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest2 {
    public static void main(String[] args) {
        // 1.创建文件对象
        File file = new File("src/test.txt");

        // 2.public boolean exists():当前文件对象，对应的文件路径是否存在，存在返回true
        System.out.println(file.exists());

        // 3.public boolean isFile():判断当前文件对象指代的是文件，是文件返回true
        System.out.println(file.isFile());

        // 4.public boolean isDirectory(): 判断档案文件对象指代的是否是文件夹，是文件夹返回true。
        System.out.println(file.isDirectory());

        // 5.public String getName():获取文件的名称（包含后缀）
        System.out.println(file.getName());

        // 6.public long length(): 获取文件的大小，返回字节个数
        System.out.println(file.length());
        // 7.public long lastModefied():获取文件的最后修改时间
        long time = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));
        // 8.public String getPath():获取创建文件对象时，使用的路径
        System.out.println(file.getPath());
        // 9.public String getAbsolutePath():获取绝对路径
        System.out.println(file.getAbsolutePath());

    }
}
