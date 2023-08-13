package Objects;
import java.util.Objects;
public class Test {
    public static void main(String[] args) {
        String a = "";
        String b = "sth";

        System.out.println(Objects.equals(a,b));

        System.out.println(Objects.isNull(a));
        System.out.println(Objects.isNull(b));

        System.out.println(Objects.nonNull(a));
        System.out.println(Objects.nonNull(b));


    }
}
