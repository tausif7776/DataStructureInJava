package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i=0; i<arr.length-1; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 2, 4, 6, 5, 3, 4, 1};

        ArrayList<Integer> result = removeDuplicates(arr);
        System.out.println(result);
    }
}