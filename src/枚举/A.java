package 枚举;

public enum A {
    //注意：枚举类的第一行必须罗列的是枚举对象的名字
    X,Y,Z;

    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
