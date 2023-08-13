package extend;

public class son extends father{

    @Override
    public void print() {
        System.out.println("子类的print调用了");
        super.print();
    }

    @Override
    public void printfa() {
        System.out.println("子类的printfa调用了");
    }
}
