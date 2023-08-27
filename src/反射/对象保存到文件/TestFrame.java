package 反射.对象保存到文件;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestFrame {
    @Test
    public void save() throws FileNotFoundException, IllegalAccessException {
        Student s1 = new Student("黑马", 45, '男', 185.3, "黑球，冰球，");
        Teacher t1 = new Teacher("老师", 999.9);

        // 需求：把人一对象的子短命和器对应的值等信息，保存到文件中去
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(t1);

    }
}
