package 内部类;

public class Test2 {
    public static void main(String[] args) {

//        1、把这个匿名内部类编译成一个子类，然后会立即创建一个子类对象出来
        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("我服了");
            }
        };
        a.cry();

//        Swimming s1 = new Swimming() {
//            @Override
//            public void Swim() {
//                System.out.println("小雨不停干");
//            }
//        };
        go(new Swimming() {
            @Override
            public void Swim() {
                System.out.println("小雨不停干");
            }
        });
    }

    // 设计一个方法， 可以接收swimming接口的一切实现类对象来参加游泳比赛
    public static void go(Swimming s){
        System.out.println("开始---------");
        s.Swim();
    }

}

interface Swimming{
    void Swim();
}

abstract class Animal{
    public abstract void cry();
}