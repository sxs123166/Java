package 反射;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Student.class;
        System.out.println(c1.getName()); //全类名
        System.out.println(c1.getSimpleName()); //简名 Student

        Class c2 = Class.forName("反射.Student");
        System.out.println(c1 == c2);

        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c2 == c3);

    }
}
