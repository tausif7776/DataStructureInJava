package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class SetCollections {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("John");
        set.add("Charlie");

        for (String name : set) {
            System.out.println(name);
            break;
        }
    }
}
