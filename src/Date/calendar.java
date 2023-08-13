package Date;

import java.util.Calendar;
import java.util.Date;

public class calendar {
    public static void main(String[] args) {
        // 1\得到系统此刻时间对应的日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2\获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);

        //3\拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        //4\拿到时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        //5\修改日历中的某个信息
        now.set(Calendar.MONTH, 9);  //修改月份成为10月份
        now.set(Calendar.DAY_OF_YEAR, 125);
        System.out.println(now);

        //6、为某个信息增加或者减少多少
        now.add(Calendar.DAY_OF_YEAR, 100);
        now.add(Calendar.DAY_OF_YEAR, -10);
        System.out.println(now);
    }
}
