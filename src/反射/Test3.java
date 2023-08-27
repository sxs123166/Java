package 反射;

import org.testng.annotations.Test;

import java.lang.reflect.Field;

public class Test3 {
    @Test
    public void testGetFields() throws NoSuchFieldException, IllegalAccessException {
        // 1、反射第一步： 必须是先得到类的Class对象
        Class c = Cat.class;
        // 2、获取类的全部成员变量
        Field[] fields = c.getDeclaredFields();
        // 3、遍历这个成员变量数组
        for (Field field : fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }
        // 4、定位某个成员变量
        Field fName = c.getDeclaredField("name");
        System.out.println(fName.getName() + "--->" + fName.getType());

        Field fAge = c.getDeclaredField("age");
        System.out.println(fAge.getName() + "--->" + fAge.getType());

        // 赋值
        Cat cat = new Cat();
        fName.setAccessible(true);
        fName.set(cat, "卡菲猫");
        System.out.println(cat);

        // 取值
        String name = (String) fName.get(cat);
        System.out.println(name);
    }


}
