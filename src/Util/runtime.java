package Util;

import java.io.IOException;

public class runtime {
    public static void main(String[] args) throws InterruptedException, IOException {

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
//        public long totalMemory 返回Java虚拟机中的内存信息
        System.out.println(runtime.totalMemory()/1024.0/1024.0 + "MB");
//        public long freeMemory返回Java虚拟机重的可用内存量
        System.out.println(runtime.freeMemory()/1024.0/1024.0 + "MB");

//        Process p = runtime.exec("//Applications//QQ.app");
//        Thread.sleep(5000);
//        p.destroy();
    }
}
