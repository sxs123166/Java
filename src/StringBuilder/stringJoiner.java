package StringBuilder;

import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        StringJoiner sr = new StringJoiner(",","[","]");
        sr.add("java1");
        sr.add("java2");
        System.out.println(sr);

        // 人为的中止虚拟机
        System.exit(0);
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr) {
        // 1、判断arr是否为null
        if(arr == null) {
            return null;
        }

        // 2、arr数组对象存在。 arr = [11,22,33]
        StringJoiner s = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i] + "");
        }
        return s.toString();

    }
}
