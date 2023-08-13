public class lambda {
    public static void main(String[] args) {
        Swimming s = () -> {
            System.out.println("学生快乐的游泳");
        };
        s .swim();
    }
}

interface Swimming{
    void swim();
}
