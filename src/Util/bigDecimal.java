package Util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigDecimal {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;

        System.out.println(c);
        System.out.println("---------------");

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);
        BigDecimal c2 = a1.subtract(b1);
        BigDecimal c3 = a1.multiply(b1);
        BigDecimal c4 = a1.divide(b1);

        System.out.println(c1);



        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j,2, RoundingMode.HALF_UP);
        System.out.println(k);

        double rs = k.doubleValue();
        System.out.println(rs);
    }
}
