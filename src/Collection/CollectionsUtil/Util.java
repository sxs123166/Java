package Collection.CollectionsUtil;

import Collection.Set.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Util {
    public static void main(String[] args) {
        // 1、public static <T> boolean addAll(Collection<? super T> c, T...elements): 为集合批量添加数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "王五", "李四", "张麻子");
        System.out.println(names);
        // 2、public static void shuffle(List<?> list): 打乱List集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);
        // 3、public static <T> void sort(List<T> list): 对list集合中的元素进行升序排序
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        // 4、public static <T> void sort(List<T> list, Comparator<? super T> v):对list集合中的元素，按照比较器对象制定的规则进行
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("蜘蛛精", 23, 169.7));
        list1.add(new Student("紫霞", 23, 169.8));
        list1.add(new Student("至尊宝", 26, 165.5));
        list1.add(new Student("牛魔王", 22, 183.5));
        Collections.sort(list1); //student必须要实现comparable接口 或者使用compartor匿名类

    }
}
