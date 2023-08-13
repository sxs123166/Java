package Date;

import java.util.Date;

public class date {
    public static void main(String[] args) {
//        1、创建一个Date对象：代表系统当前时间
        Date d = new Date();
        System.out.println(d);

        //2、拿到毫秒值
        long time = d.getTime();
        System.out.println(time);

//        3、把时间毫秒值转换成日期对象、2s之后的时间是多少
        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);

//        4、直接把日期对象的时间通过set方法进行修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);

    }
}
