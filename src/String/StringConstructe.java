package String;

public class StringConstructe {
    public static void main(String[] args) {

        String name = "hhhhh";

        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("hhhhh");
        System.out.println(rs2);

        char[] chars = {'a', 'b', 'c'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes = {97, 98, 99};
        String rs4 = new String(bytes);

    }
}
