package ClassDemo;

public class Array {
    public static void main(String[] args) {
        // 数组初始化
        // names存储的是数组的地址
        // 引用数据类型
        String[] names = {"尚xx","冯xx","王xx"};
//        System.out.println(names);


        String str = "";
        for (int i = 0;i < 3;i++) {
            str += names[i];
        }

        System.out.println(str);
        //
        int[] nums = new int[5];

    }
}
