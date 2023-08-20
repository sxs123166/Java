package Thread.tz;

public class Test1 {
    public static void main(String[] args) {

        Runnable target = new MyRunable2();

        for (int i = 1; i <= 1000; i++) {
            new Thread(target).start();
        }

    }
}
