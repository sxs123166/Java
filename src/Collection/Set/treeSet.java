package Collection.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(5);
        set.add(7);
        System.out.println(set);

        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        students.add(new Student("蜘蛛精", 23, 169.7));
        students.add(new Student("紫霞", 23, 169.8));
        students.add(new Student("至尊宝", 26, 165.5));
        students.add(new Student("牛魔王", 22, 183.5));
        System.out.println(students);
    }


}
