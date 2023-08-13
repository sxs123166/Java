package IO_Stream;

import java.io.*;

public class ResourceTest6 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("src/test.png");
                OutputStream os = new FileOutputStream("src/test2.png");
                // 注意：这里只能防止资源对象（流对象）
                // int age = 21;
                // 什么事资源呢？资源都会实现AutoCloseable接口。资源都会有一个close方法，并且资源放到这里后
                // 用完之后，会被自动调用其close方法完成资源的释放操作
                MyConnection myConnection = new MyConnection();
                )
        {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
