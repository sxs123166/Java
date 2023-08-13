package StringBuilder;

public class builder {
    public static void main(String[] args) {
        StringBuilder sr = new StringBuilder();
        for (int i = 0;i < 10000; i++) {
            sr.append("abc");
        }

        System.out.println(sr);

    }
}
