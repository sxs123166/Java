package Thread.safe;

public class ThreadTest {
    public static void main(String[] args) {
        // 1.创建一个账户对象，代表两人的账户
        Account acc = new Account("ICBC-110", 100000);
        // 2.创建两个线程，分别代表小明，小红，再去同一个账户对象中取钱10万
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();

    }
}
