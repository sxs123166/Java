package Util;

public class system {
    public static void main(String[] args) {
        // 1.public static void exit(int status)
        // 中止当前运行的虚拟机
        // 该参数用作状态码；按照惯例、非0状态码表示异常终止
        // System.exit(0) 认为的中止虚拟机 不要使用

        //2、public static long currentTimeMillis()
        // 获取当前系统时间
        // 返回的是long类型的时间毫秒值：指的是从1970-1-1 0:0:0开始走到此刻的总的毫秒值，1s = 1000ms
        long time = System.currentTimeMillis();
        System.out.println(time);



    }
}
