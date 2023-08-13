package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormat {
    public static void main(String[] args) throws ParseException {
//        1、准备一些时间
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        // 2、格式化日期对象、时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        String rs = sdf.format(d);
        String rs2 = sdf.format(time);
        System.out.println(rs);
        System.out.println(rs2);
        System.out.println("-----------------");

        String dateStr = "2022-12-12 12:12:11";
        // 1、创建简单日期化对象，指定的时间格式必须与被解析的时间格式一摸一样，否则程序会出bug
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 把时间字符串解析成时间对象
        Date d2 = sdf2.parse(dateStr);

        System.out.println(d2);

    }

}
