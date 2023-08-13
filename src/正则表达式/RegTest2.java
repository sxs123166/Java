package 正则表达式;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest2 {
    public static void main(String[] args) {
        // 1、字符类(只能匹配单个字符)
        System.out.println("a".matches("[abc]")); //[abc]只能匹配a、b、c
        System.out.println("e".matches("[abc]")); //false

        System.out.println("d".matches("[^abc]")); // [^abc] 不能是abc
        System.out.println("a".matches("[^abc]")); //false

        System.out.println("b".matches("[a-zA-Z]")); //  [a-zA-Z]只能是a-z A-Z的字符
        System.out.println("2".matches("[a-zA-Z]")); //false

        System.out.println("k".matches("[a-z&&[^bc]]")); // a到z 除了b和c
        System.out.println("b".matches("[a-z&&[^bc]]")); // false

        System.out.println("ab".matches("[a-zA-Z0-9]")); //false 注意：以上带[内容]的规则都只能用于匹配单个字符

        //2、预定义字符(只能匹配单个字符)  .  \d  \D  \s  \S  \w  \W
        System.out.println("徐".matches(".")); //.可以匹配任意字符
        System.out.println("徐徐".matches(".")); // false

        // 注意 \在Java中有特殊意义：\n表示换行  \t代表一个缩进， 所以想要得到 \ 就需要在加一个\
        System.out.println("1".matches("\\d")); // true 代表一位数字
        System.out.println("12".matches("\\d")); // false

        System.out.println(" ".matches("\\s")); // \s代表一个空白字符
        System.out.println("a".matches("\\s")); // false

        System.out.println("a".matches("\\S")); // \S：代表一个非空白字符
        System.out.println(" ".matches("\\S")); // false

        System.out.println("a".matches("\\w")); // \w:[a-zA-Z_0-9] 字母数字下划线
        System.out.println("_".matches("\\w")); // true
        System.out.println("a".matches("\\w")); // false

        System.out.println("徐".matches("\\W")); // [^\w]不能是a-zA-Z_0-9
        System.out.println("a".matches("\\W")); // false

        System.out.println("23232".matches("\\d")); // false 注意：以上预定义字符都只能匹配单个字符

        // 3、数量词 ?  *  +   {n} {n,} {n,m}
        System.out.println("a".matches("\\w?")); //? 代表0次或1次
        System.out.println("".matches("\\w?")); // true
        System.out.println("abc".matches("\\w?")); // false

        System.out.println("abc12".matches("\\w*")); // *代表 0次或多次
        System.out.println("".matches("\\w*")); // true
        System.out.println("abc12张".matches("\\w*")); // false "张"不能匹配\w

        System.out.println("a3c".matches("\\w{3}")); // {3}代表正好是3次
        System.out.println("abcd".matches("\\w{3}")); // false
        System.out.println("abcd".matches("\\w{3,}")); // w{3,}代表是>=3次
        System.out.println("ab".matches("\\w{3,}")); // false
        System.out.println("abcda徐".matches("\\w{3,}")); //false
        System.out.println("abcd13232".matches("\\w{3,9}")); //{3,9}代表是 大于等于3次， 小于等于9次

        //4、其他几个常用的符号： (?i)忽略大小写、或: |、 分组：()
        System.out.println("abc".matches("(?i)abc")); //true
        System.out.println("ABC".matches("(?i)abc")); //true
        System.out.println("aBc".matches("a((?i)b)c")); //true
        System.out.println("ABc".matches("a((?i)b)c")); //false

        // 需求1:要么是三个小写字母，要么是三个数字
        System.out.println("123".matches("\\d{3}|[a-z]{3}"));
        System.out.println("abc".matches("\\d{3}|[a-z]{3}"));
        System.out.println("aac".matches("\\d{3}|[a-z]{3}"));

        // 需求2 必须是我爱开头，中间可以是至少一个“编程”，最后至少是一个666
        System.out.println("我爱编程666".matches("我爱(编程)+(666)+")); //true
        System.out.println("我爱编程66666".matches("我爱(编程)+(666)+")); //false

    }

    // 使用正则表达式爬取信息
    @Test
    public static void getInformation() {

        String data = "来黑马程序员学习Java, \n" +
                "电话:1866668888,18699997777\n" +
                "或者联系邮箱：boniu@itcast.cn, \n" +
                "座机电话：01036517895， 010-98951256\n" +
                "邮箱：bozai@itcast.cn, \n" +
                "邮箱2:dllei0009@163.com, \n" +
                "热线电话：400-618-9090, 400-618-4000,4006184000,4006189090";
        // 1. 定义爬取规则
        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|" +
                "(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15})|400-?\\d{3,8}-?\\d{3,8}";
        // 2.把正则表达式封装成一个Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // 3.通过pattern对象得到查找内容的匹配器
        Matcher matcher = pattern.matcher(data);
        // 4.通过匹配起开始去内容中查找信息
        while (matcher.find()) {
            System.out.println(matcher.group()); //取出信息
        }
    }

    // 用于搜索替换、分割内容
    @Test
    public static void regexreplace() {
//        public string replaceAll(String regex, String newStr)：按照正则表达式匹配的内容进行替换
        String s1 = "古力娜扎ai8888迪丽热巴999aa5566玛尔扎哈fbbfsfs42425";
        System.out.println(s1.replaceAll("\\w+", "-"));

        String s2 = "我我我喜欢编编编编编编程程程程";
        /**
         *  (.)一组 .匹配任意字符
         * \\1 ：为这个组声明一个组号：1号
         * +：声明必须是重复的字
         * $1可以去取到第一组代表的哪个重复的字
         */
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));

        String s3 = "古力娜扎ai8888迪丽热巴999aa5566玛尔扎哈fbbfsfs42425";
        String[] names = s3.split("\\w+");
        System.out.println(Arrays.toString(names));

    }
}
