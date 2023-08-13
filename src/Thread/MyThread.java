package Thread;

// 1.让子类继承Thread线程类
public class MyThread extends Thread{
    // 2.必须充血Thread类的run方法

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i <= 5; i++) {
            System.out.println(t.getName() + "线程输出:" + i);
        }

    }
}
