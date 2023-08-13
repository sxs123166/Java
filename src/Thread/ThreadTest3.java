package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3.创建一个Callable的对象
        Callable<String> call = new MyCallable(100);
        // 4.把callable的对象封装成一个FutureTask对象（任务对象）
        // 未来任务对象的作用
        // 1。是一个任务对象，实现了Runnable对象
        // 2。可以在线程执行完毕之后，咏未来任务对象调用get方法获取线程执行完毕之后的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        // 5。把任务对象交给一个Thread对象
        new Thread(f1).start();

        // 6。获取线程执行完毕后返回的结果
        // 代码执行到这，假如上面的线程还没有执行完毕
        // 这里的代码会暂停，等待上面的线程执行完毕后才会获取结果
        String rs = f1.get();
        System.out.println(rs);

    }
}
