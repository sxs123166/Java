package 异常;

public class exceptionTest2 {
    public static void main(String[] args) {
        // 保存一个合法的年龄
        try {
            saveAge(160);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            saveAge2(256);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveAge(int age) {
        if(age > 0 && age < 150) {
            System.out.println("年龄被成功保存" + age);
        }else {
            // 用一个异常对象封装这个问题
            throw new AgeIllegalRuntimeException("/age is illegal, your age is " + age);
        }
    }

    // 编译时异常
    public static void saveAge2(int age) throws AgeIllegalException {
        if(age > 0 && age < 150) {
            System.out.println("年龄被成功保存" + age);
        }else {
            // 用一个异常对象封装这个问题
            throw new AgeIllegalException("/age is illegal, your age is " + age);
        }
    }
}
