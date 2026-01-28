package Recursion;

import java.util.ArrayList;

public class StringRecursion {
    public static void main(String[] args) {
        String str = "Tausif";
        change(str);
        System.out.println(str);

        String[] arr = {"tausif", "ahmed", "aamir"};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");


            ArrayList<String> lst = new ArrayList<>();
            lst.add("king");
            lst.add("raj");
            lst.add("ahmed");
            System.out.println(lst);
        }
    }

    private static void change(String str) {
        str = "Ahmed";

    }
}
