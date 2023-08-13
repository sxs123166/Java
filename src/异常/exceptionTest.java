package 异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exceptionTest {
    public static void main(String[] args) throws ParseException {
        Integer.valueOf("abc");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:24");
        System.out.println(d);
    }
}
