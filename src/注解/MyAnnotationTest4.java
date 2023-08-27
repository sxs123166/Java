package 注解;

import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnnotationTest4 {
    @Test
    public void test1(){
        System.out.println("===Test1===");
    }

    @MyTest
    public void test2() {
        System.out.println("===test2===");
    }

//    @MyTest
    public void test3() {
        System.out.println("===test3===");
    }

    @MyTest
    public void test4() {
        System.out.println("===test4===");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyAnnotationTest4 a = new MyAnnotationTest4();
        // 1.得到class对象
        Class c = MyAnnotationTest4.class;
        // 2.提取这个类的全部方法
        Method[] methods = c.getDeclaredMethods();
        // 3.遍历这个数组中的每个方法，看方法尚是否存在@MyTest注解， 存在
        // 触发该方法
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)) {
                //说明方法上是存在@MyTest,触发该方法执行
                method.invoke(a);
            }
        }

    }
}
