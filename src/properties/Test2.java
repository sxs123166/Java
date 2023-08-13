package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 1、创建properties对象出来
        Properties properties = new Properties();
        properties.setProperty("张三", "123");
        properties.setProperty("李四", "123");
        properties.setProperty("王五", "123");

        // 2、把properties对象中键值对的数据存入到属性文件中去
        properties.store(new FileWriter("src/properties/test.properties"), "注释信息");

    }
}
