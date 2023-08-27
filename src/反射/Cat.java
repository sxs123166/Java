package 反射;

public class Cat {
    public static int a;
    public static final String COUNTRY = "中国";
    private String name;
    private int age;

    public Cat() {
    }

    private Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void run() {
        System.out.println("跑的巨快");
    }

    public void eat() {
        System.out.println("吃的巨快");
    }

    private String eat(String name) {
        return "最爱吃" + name;
    }


}
