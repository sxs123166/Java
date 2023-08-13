package 正则表达式;

public class RegexTest {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("dwdawdawdawda"));
        System.out.println(checkQQ("251425876"));


    }

    public static boolean checkQQ(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }
}
