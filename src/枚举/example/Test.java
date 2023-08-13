package 枚举.example;

public class Test {
    public static void main(String[] args) {

    }

    public static void check(Constant sex) {
        switch (sex) {
            case BOY:
                System.out.println("展示男孩的图");
                break;
            case GIRL:
                System.out.println("展示女孩的图");
                break;

        }
    }
}
