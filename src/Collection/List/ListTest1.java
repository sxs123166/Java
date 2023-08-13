package Collection.List;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象（有序，可重复，有索引）
        List<String> list = new ArrayList<>(); //一行经典代码
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("牛夫人");
        list.add("牛魔王");

        // 2.public void add(int index, E element): 在某个缩阴位置插入元素
        list.add(2, "紫霞仙子");
        System.out.println(list);

        // 3.public E remove(int index):根据索引删除元素，返回被删除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        // 4.public E get(int index):返回集合中指定位置的元素
        System.out.println(list.get(3));

        // 5.public E set(int index, E element):修改索引位置处的元素，修改成功后，会返回原来的数据
        System.out.println(list.set(3, "牛魔王"));
        System.out.println(list);

        // 遍历参考collections的

    }

    // 删除数据时注意点
    @Test
    public static void removeEle() {
        // 找出集合中全部带“李”的名字，并从集合中删除
        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱花");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(name.contains("李")) {
                list.remove(name);
                i--; //注意一定要移动
            }
        }

        //或者倒着遍历删除不需要i--；

        //使用迭代器也可
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.contains("李")) {
                // list.remove(name); //会发生并发修改异常的错误
                iterator.remove(); //删除迭代器当前遍历到的数据，每删除一个数据后，相当于也在底层做了i--
            }
        }
        System.out.println(list);


        // 使用增强for循环遍历集合并删除数据，没有办法解决bug


    }
}
