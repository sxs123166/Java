package 泛型;

import java.util.ArrayList;

public class MethodTest {
    public static void main(String[] args) {
        test("java");
    }

    public static <T> T test(T t) {
        return t;
    }

    //?通配符，在使用反省的时候可以代表一切类型
    public static void go(ArrayList<?> cars) {
    }

    public static void dosth(ArrayList<? extends Animal> cars) {

    }
}
