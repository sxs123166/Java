package Thread.tz;

public class MyRunable1 implements Runnable{
    private int count;


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " count =====>" + (++count));
        }
    }
}
