package Thread;

public class ThreadTest {
    public static void main(String[] args) {
        // 3.创建MyThread县城累的对象代表一个线程
        Thread t = new MyThread("1号线程");
        // 4.启动线程
        t.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程输出:" + i);
        }
    }
}
