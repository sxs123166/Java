package Thread.ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    // 2.重写call方法
    @Override
    public String call() throws Exception {
        // 描述线程的任务，返回线程执行返回后的结果

        int sum = 0;
        for (int i = 1; i<= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "求出了1-" + n + "的和是：" + sum;
    }
}
