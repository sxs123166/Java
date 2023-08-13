package 内部类;

public class Outer {
    private int age = 99;
    private static String a;
    // 内部成员类
    public class Inner{
        private String name;
        public String schoolName;
        private int age = 88;

        public void test(){
            System.out.println(age);
            System.out.println(a);

            int age = 66;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println( Outer.this.age );
        }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
