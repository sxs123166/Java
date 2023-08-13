package 泛型;

public class Test {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("java1");
        list.add("java2");
        String ele = list.get(1);
        System.out.println(ele);

        MyClass<String, String> c2 = new MyClass<>();
//        c2.put();

        MyClass2<Animal> c = new MyClass2();
        MyClass2<Dog> d = new MyClass2();


    }
}
