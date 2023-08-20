package Thread.communication;

public class ThreadTest {
    public static void main(String[] args) {

        // 3个生产者线程，负责生产包子，每个线程每次只能生产1个包子放在桌子上
        // 2个消费者线程负责吃包子，没人每次只能从桌子上拿一个包子吃
        Desk desk = new Desk();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师1").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师2").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师3").start();

        // 创建2个消费者线程
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "吃货1").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "吃货2").start();


    }
}
