package 注解;

public @interface MyTest2 {
    String value(); //特殊属性
    int age() default 23;
}
