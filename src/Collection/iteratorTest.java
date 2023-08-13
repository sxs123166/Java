package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class iteratorTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java1");
        c.add("java2");
        c.add("java3");

        // 迭代器遍历
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 使用增强for遍历集合或者数组
        for (String ele : c) {
            System.out.println(ele);
        }

        // Lambda表达式
        // default void forEach(Consumer<? super T> action): 结合Lambda表达式遍历集合
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        c.forEach((String s) -> {
            System.out.println(s);
        });

        c.forEach(s -> {
            System.out.println(s);
        });

        c.forEach(s -> System.out.println(s));

        c.forEach(System.out::println);

        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖申克的救赎》", 9.7, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆·汉克斯"));
        System.out.println(movies);

        for (Movie movie : movies) {
            System.out.println("片名:" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
        }
    }
}
