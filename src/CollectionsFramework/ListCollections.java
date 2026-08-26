package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListCollections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JavaScript");
        list.add("Python");
        list.add("Python");

        for (String res : list) {
            System.out.println(list);
            break;
        }
    }
}
