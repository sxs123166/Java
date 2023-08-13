package Object_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest1 {
    public static void main(String[] args) {
        try (
                // 创建一个字节输入流管道， 包装低级的字节输入流与源文件相通
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/test9.txt"));
                ){
            User u =(User) ois.readObject();
            System.out.println(u);

            List<User> list = (List<User>) ois.readObject();
            System.out.println(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
