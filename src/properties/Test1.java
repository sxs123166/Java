package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个Properties的对象出来（键值对集合，空容器）
        Properties properties = new Properties();
        System.out.println(properties);

        // 2、开始加载属性文件重的键值对数据到properties对象中去
        properties.load(new FileReader("src/properties/users.properties"));
        System.out.println(properties);

        // 根据键取值
        System.out.println(properties.getProperty("赵敏"));
        System.out.println(properties.getProperty("张无忌"));

        // 遍历全部的键和值
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "--->" + value);
        }

        properties.forEach((k, v) -> {
            System.out.println(k + "--->" + v);
        });

    }
}
