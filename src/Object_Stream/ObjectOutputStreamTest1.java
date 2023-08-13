package Object_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamTest1 {
    public static void main(String[] args) {

        try (
                // 创建一个对象字节输出流包装原始的 字节输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/test9.txt"));
                ){
            User u = new User("admin", "张三", 32, "666888xyz");
            // 序列化对象到文件中去
            oos.writeObject(u);
            System.out.println("序列化对象成功");

            ArrayList<User> list = new ArrayList();
            list.add(new User("admin", "张三", 32, "666888xyz"));
            list.add(new User("2", "张三", 32, "666888xyz"));
            list.add(new User("3", "张三", 32, "666888xyz"));
            list.add(new User("4", "张三", 32, "666888xyz"));

            oos.writeObject(list);
             // 如果要一次序列化多个对象，可以使用ArrayList集合存储多个对戏那个，然后直接对集合进行序列化即可
            // 注意：ArrayLList集合已经实现了序列化接口
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
