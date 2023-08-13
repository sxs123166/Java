package ClassDemo;

import java.util.Scanner;

public class MethodStarTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i <= n; i++) {

            //打印空格
            for (int j = 1;j <= n - i; j++) {
                System.out.print(" ");
            }

            // 打印*
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j % 2 == 0 ? " " : "*");
            }

            System.out.println();
        }
    }
}
