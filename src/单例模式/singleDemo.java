package 单例模式;

public class singleDemo {
    private static singleDemo s;

    // 1、私有化类的构造器
    private singleDemo() {
    }

    // 3、定义一个类方法返回类的对象
    public static singleDemo getInstance() {
        if(s == null) {
            s = new singleDemo();
        }
        return s;
    }

}
