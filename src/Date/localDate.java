package Date;

import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {

        //0、获取本地日期对象
        LocalDate ld = LocalDate.now();// 年 月 日
        System.out.println(ld);

        //1\获取日期对象中的信息
        int year = ld.getYear(); //年
        int month = ld.getMonthValue(); //月
        int day =ld.getDayOfMonth(); //日
        int dayOfYear = ld.getDayOfYear();
        int dayOfWeek = ld.getDayOfWeek().getValue();


        //2\直接修改某个信息 withYear withMonth withDayOfMonth withDayOfYear
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(12);
        System.out.println(ld2);
        System.out.println(ld);
        //3、把某个信息加多少 plusYears plusMonths plusDays plusWeeks
        LocalDate ld4 = ld.plusYears(1);
        System.out.println(ld4);
        //4\把某个信息减多少 minusYears minusMonths minusDays minusWeeks
        LocalDate ld5 = ld.minusYears(1);
        System.out.println(ld5);
        //5\获取指定日期的LocalDate对象： public static LocalDate of(int year, int month)
        LocalDate ld8 = LocalDate.of(2099, 12, 12);
        LocalDate ld9 = LocalDate.of(2099, 12, 12);
        //6\判断2个日期对象，是否相等、在前还是在后：equals isBefore isAfter
        System.out.println(ld8.equals(ld9));




    }
}
