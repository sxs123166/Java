package log;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Test1 {
    // 创建一个日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("Test1"); //日志对象的名字，可以随便起

    public static void main(String[] args) {
        try {
            LOGGER.info("chu方法开始执行");
            chu(10, 0);
            LOGGER.info("chu方法执行完成");
        }catch (Exception e) {
            LOGGER.info("chu方法执行失败");
        }
    }

    public static void chu(int a, int b) {
        LOGGER.debug("参数a" + a);
        LOGGER.debug("参数b" + b);
        int c = a / b;
        System.out.println("结果是" + c);
        LOGGER.info("结果是：" + c);
    }
}
