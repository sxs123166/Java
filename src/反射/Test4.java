package 反射;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4 {
    @Test
    public void testGetMethods() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 1.反射第一步：先得到Class对象
        Class c = Cat.class;
        // 2.获取类的全部成员方法
        Method[] methods = c.getDeclaredMethods();
        // 3.遍历数组中的每个数组对象
        for (Method method : methods) {
            System.out.println(method.getName() + "---->"
                    + method.getParameterCount() + "--->"
                    + method.getReturnType());
        }
        // 4.获取某个方法
        Method run = c.getDeclaredMethod("run");
        System.out.println(run.getName() + "--->"
        + run.getParameterCount() + "--->"
        + run.getReturnType());

        Method eat = c.getDeclaredMethod("eat", String.class); //获取返回值是String的方法
        System.out.println(eat.getName() + "--->"
        + eat.getParameterCount() + "--->"
        + eat.getReturnType());

        Cat cat = new Cat();
        run.setAccessible(true); // 禁止检查访问权限
        Object rs = run.invoke(cat); // 调用无参数的run方法，用cat对象触发调用
        System.out.println(rs);

        eat.setAccessible(true);
        String rs2 = (String) eat.invoke(cat, "鱼");
        System.out.println(rs2);
    }
}
