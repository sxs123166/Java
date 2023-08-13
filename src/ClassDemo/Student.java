package ClassDemo;

public class Student {
    String name;
    String age;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
}
