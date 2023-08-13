package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
    public static void main(String[] args) {
        // 1、创建一个Set集合的对象
//        Set<Integer> set = new HashSet<>(); //创建一个HashSet的集合对象， 一行经典代码  无序 不重复 无索引
//        Set<Integer> set = new LinkedHashSet<>(); //创建一个HashSet的集合对象， 一行经典代码  有序 不重复 无索引
        Set<Integer> set = new TreeSet<>(); //创建一个HashSet的集合对象， 一行经典代码  可排序 不重复 无索引

        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(777);
        set.add(777);
        set.add(666);
        set.add(666);
        System.out.println(set);

        // 判断两个对象的hash是否相等，需要重写hashCode和equals方法



    }
}
