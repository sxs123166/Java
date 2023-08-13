package Thread;

import org.testng.annotations.Test;

public class ThreadTest2 {
    public static void main(String[] args) {
        // 3.创建任务对象
        MyRunable target = new MyRunable();
        // 4.把任务对象交给一个线程对象处理
        new Thread(target).start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程输出:" + i);
        }
    }


    @Test
    public static void test() {
        // 1.直接创建Runable接口的匿名内部类形式
//        Runnable target = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println("子线程输出:" + i);
//                }
//            }
//        };


        // 简化形式
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println("子线程输出:" + i);
//                }
//            }
//        }).start();

        new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("子线程输出:" + i);
            }
        }).start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程输出:" + i);
        }
    }
}
