package Collection.Map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); //一行经典代码。按照 无序，不重复，无索引。
        map.put("手表", 100);
        map.put("手表", 220); //会覆盖
        map.put("手机", 2);
        map.put("Java", 2);
        map.put(null, null);
        System.out.println(map);

        Map<Integer, String> map1 = new TreeMap<>(); // 可排序，不重复， 无索引
        map1.put(23, "Java");
        map1.put(23, "MySQL");
        map1.put(19, "李四");
        System.out.println(map1);

        // 2.public int size():获取集合大小
        System.out.println(map.size());

        // 3.public void clear():请空集合
        map.clear();
        // 4.public boolean isEmpty():判断集合是否为空，为空返回true，反之
//        System.out.println(map.isEmpty());
        // 5.public V get(Object key):根据键获取值
        map.get("手表");
        // 6.public V remove(Object key):根据键删除整个元素（删除会返回键的值）
        map.remove("手表");
        // 7.public boolean containsKey(Object key): 判断是否包含某个键，包含返回true
        map.containsKey("手表");
        // 8.public boolean containsValue(Object value):判断是否包含某个值
        map.containsValue(2);
        // 9.public Set<K> keySet():获取Map集合的全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // 10.public Collection<V> values(); 获取Map集合的全部值
        Collection<Integer> values = map.values();
        System.out.println(values);

        // 11.把其他Map集合的数据导入到自己集合中来
//        map.putAll(map1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java1", 10);
        map2.put("java2", 20);
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("java3", 20);
        map3.put("java4", 222);
        map2.putAll(map3);
        System.out.println(map2);
        System.out.println(map3);
    }
}
