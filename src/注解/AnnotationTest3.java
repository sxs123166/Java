package 注解;

import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTest3 {
    @Test
    public void parseClass(){
        // 1、先得到Class对象
        Class c = Demo.class;
        // 2、解析类上的注释
        // 判断类上是否包含了某个注解
        if(c.isAnnotationPresent(MyTest4.class)) {
            MyTest4 myTest4 =
                    (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        // 1、先得到Class对象
        Class c = Demo.class;
        Method m = c.getDeclaredMethod("test1");
        // 2、解析类上的注释
        // 判断类上是否包含了某个注解
        if(m.isAnnotationPresent(MyTest4.class)) {
            MyTest4 myTest4 =
                    (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }


}
