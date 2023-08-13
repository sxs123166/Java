package extend;

public class father {
    String name;
    String age;

    public void print() {
        System.out.println("父类的print调用了");
        printfa();
    }

    public void printfa() {
        System.out.println("父类的printfa调用了");
    }
}
