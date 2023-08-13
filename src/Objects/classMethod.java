package Objects;

import java.util.ArrayList;

public class classMethod {
    public static void main(String[] args) {
        // 包装类的使用
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        // 自动装箱
        Integer a3 = 12;

        // 自动拆箱
        int a4 = a3;

        // 泛型和集合不支持基本数据类型，只能支持引用数据类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);

        int rs = list.get(1);//自动拆箱


        //1、基本数据类型的数据转换成字符串
        Integer a = 23;
        String rs1 = Integer.toString(a); // "23"
        System.out.println(rs1 + 1); // 231

        String rs2 = a.toString(); // "23"
        System.out.println(rs2 + 1);

        String rs3 = a + "";
        System.out.println(rs3 + 1);

        //2、把字符串类型的数据转换成对应的基本类型
        String ageStr = "29";
        int ageI = Integer.valueOf(ageStr); //29
        System.out.println(ageI + 1); // 30


        String scoreStr = "99.5";
        double score = Double.valueOf(scoreStr);
        System.out.println(score + 0.5);


    }
}
