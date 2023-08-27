package 反射;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;

public class Test2 {
    @Test
    public void testGetConstructors(){
        // 1.反射第一步： 必须线得到这个类的Class对象
        Class c = Cat.class;
        // 2.获取类的全部构造器(只能获取public修饰的)
//        Constructor[] constructors = c.getConstructors();
        // 获取全部的
        Constructor[] constructors = c.getDeclaredConstructors();

        // 3.遍历数组中的每个构造器对象
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "--->"
            + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        // 1、反射第一步：必须先得到这个类的class对象
        Class c = Cat.class;
        // 2.获取某个构造器，无参数构造器
//        Constructor constructor = c.getConstructor();
        Constructor constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "--->"
                + constructor.getParameterCount());
        constructor.setAccessible(true);
        Cat cat = (Cat) constructor.newInstance();
        System.out.println(cat);

        // 3.获取有参数构造器
        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor.getName() + "--->"
                + constructor.getParameterCount());
        constructor1.setAccessible(true);
        Cat cat1 = (Cat) constructor1.newInstance("叮当猫", 3);
        System.out.println(cat1);
    }
}
