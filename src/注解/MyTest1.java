package 注解;

public @interface MyTest1 {
    String aaa();
    boolean bbb() default true;
    String[] ccc();

}
