package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        System.out.println(names);

        // 使用stream流解决问题
        List<String> list = names.stream().filter(s -> s.startsWith("张")).filter(a -> a.length() == 3)
                .collect(Collectors.toList());
        System.out.println(list);



    }
}
