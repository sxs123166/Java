package Thread.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.CallerRunsPolicy());

        ExecutorService pool = Executors.newFixedThreadPool(3);
        // 核心线程数量应该配值多少
        // 计算密集型的任务：核心线程数量 = cpu的核数 + 1
        // IO密集型的任务： 核心线程数量 = CPU核数 * 2

        // 2、使用线程处理Callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
