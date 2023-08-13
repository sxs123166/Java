package ClassDemo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        System.out.println("您输入的年龄是:" + age);

        Student student = new Student();
        student.setName("fjj");

    }
}
