package Thread;

import org.testng.annotations.Test;

public class ThreadMethodTest1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号线程");
//        t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号线程");
//        t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName());

        // 主线程对象的名字
        // 哪个线程执行它，他就会得到哪个线程对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程输出:" + i);
        }
    }



    @Test
    public static void test() throws InterruptedException {
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i);
//            // 休眠5s
//            if(i == 3) {
//                Thread.sleep(5000);
//            }
//        }

        // join方法的作用：让当前调用这个方法的线程先执行完
        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();
    }

}
