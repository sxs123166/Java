package Thread.safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;
    // 创建了一个锁对象
    private final Lock lk = new ReentrantLock();

    public Account() {}

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 静态方法使用类名.class作为锁
    public static void test() {
        synchronized (Account.class){

        }
    }

//    public synchronized void drawMoney(double money) {
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        try {
            // 1、判断余额是否足够
            // this正好代表共享资源
//        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "来取钱" + money + "成功！");
                this.money -= money;
                System.out.println(name + "来取钱后，余额剩余：" + money + "成功！");
            } else {
                System.out.println(name + "来取钱：余额不足");
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();
        }
    }
//    }
}
