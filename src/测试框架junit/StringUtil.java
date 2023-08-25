package 测试框架junit;

public class StringUtil {
    public static void printNumber(String name) {
        System.out.println("名字长度是：" + name.length());
    }


    public static int getMaxIndex(String data) {
        if(data == null) {
            return -1;
        }
        return data.length() - 1;
    }
}
