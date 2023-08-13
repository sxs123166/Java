package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class collectionTest {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        System.out.println(arrayList);

        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        System.out.println(set);


    }
}
