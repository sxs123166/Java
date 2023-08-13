package ClassDemo;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {

        Random r = new Random();
        int lucknum = r.nextInt(100) + 1;

        System.out.println(lucknum);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您猜测的数据:");

            int number = sc.nextInt();
            if(number > lucknum) {
                System.out.println("您猜的数字大了");
            }else if(number < lucknum) {
                System.out.println("您猜的数字小了");
            }else {
                System.out.println("恭喜您猜对了");
                break;
            }
        }

    }
}
