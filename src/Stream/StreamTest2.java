package Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        // 1.获取List集合的Stream流
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        Stream<String> stream = names.stream();
//        System.out.println(names);

        // 2.获取Set结合的Stream流
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "刘德华", "张曼玉", "蜘蛛精", "马德");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("德")).forEach(s -> System.out.println(s));

        // 3、获取Map集合的Stream流
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("玛尔扎哈", 166.3);
        map.put("卡尔扎吧", 168.3);

        Set<String> keys = map.keySet();
        Stream<String> ks = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e -> e.getKey().contains("巴")).forEach(e -> System.out.println(e.getKey() + "---->" + e.getValue()));

        // 4.获取数组的stream流
        String[] names2 = {"张翠山", "东方不败", "唐大山", "孤独求败"};
        Stream<String> s1 = Arrays.stream(names2);
        Stream<String> s2 = Stream.of(names2);
        s2.forEach(e -> System.out.println(e));
    }
}
