package Thread.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolTest1 {
    public static void main(String[] args) {
        // 1.通过ThreadPoolExecutor创建一个线程池对象
        /* public ThreadPoolExector(int corePoolSize,
                                    int maximumPoolSize,
                                    long keepAliveTime,
                                    TimeUnit unit
                                    BlockingQueue<Runnable> workQueue,
                                    ThreadFactory threadFactory,
                                    RejectedExecutionHandler handler) */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        Runnable target = new MyRunnable();
        pool.execute(target); // 线程池会自动创建一个新线程， 自动处理一个任务，自动执行的
        pool.execute(target); // 线程池会自动创建一个新线程， 自动处理一个任务，自动执行的
        pool.execute(target); // 线程池会自动创建一个新线程， 自动处理一个任务，自动执行的
        pool.execute(target); // 复用前面的核心线程
        pool.execute(target); // 复用前面的核心线程
        pool.execute(target);
        pool.execute(target);
        // 到了临时线程的创建时机了
        pool.execute(target);
        pool.execute(target);
        // 到了新任务的拒绝时机了
        pool.execute(target);


//       pool.shutdown(); // 等待线程池的任务全部执行完毕后，在关闭线程
//       pool.shutdownNow(); // 立即关闭线程池！不管任务是否执行完毕



    }
}
