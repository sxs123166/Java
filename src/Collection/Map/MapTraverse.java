package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraverse {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);
        System.out.println(map);


        /// 1.通过键遍历
        // 1、获取Map的全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // 2、遍历全部的键，根据键获取对应的值
        for (String key : keys) {
            // 根据键获取对应的值
            double value = map.get(key);
            System.out.println(key + "====>" + value);
        }

        // 2、通过Map集合提供entrySet方法，把Map集合转换成简直对类型的set集合
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            double value = entry.getValue();
            System.out.println(key + "--->" + value);
        }

        // 3.使用lambda表达式遍历
        map.forEach((k, v) -> {
            System.out.println(k + "---->" + v);
        });

        map.forEach(new BiConsumer<String, Double>() {
            @Override
            public void accept(String k, Double v) {
                System.out.println(k + "---->" + v);
            }
        });


    }
}
