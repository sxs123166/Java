package Collection.嵌套;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 1.定义一个Map集合存储去啊不得生粉信息，和对应的城市信息
        Map<String, List<String>> map = new HashMap<>();

        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        map.put("江苏省", cities1);
        System.out.println(map);

        List<String> cities = map.get("湖北省");
        for (String city : cities) {
            System.out.println(city);
        }

        map.forEach((p, c) -> {
            System.out.println(p + "--->" + c);
        });


    }
}
