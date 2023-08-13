package dataStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataInputStreamTest1 {
    public static void main(String[] args) {
        try (
                // 1、创建一个数据输出流包装低级的字节输出流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/test8.txt"));
                ){
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("黑马");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
