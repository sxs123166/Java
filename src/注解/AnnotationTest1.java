package 注解;

@MyTest1(aaa="牛魔王", ccc = {"HTML", "Java"})
//@MyTest2(value = "孙悟空")
@MyTest2("孙悟空")
public class AnnotationTest1 {
     @MyTest1(aaa="牛魔王", ccc = {"HTML", "Java"})
    public void test1() {

     }
}
