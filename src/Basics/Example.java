package Basics;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int mx = arr[0];

        for (int i=1; i<arr.length; i++) {
            if (mx > arr[i]) {
                mx = arr[i];
            }
        }
        System.out.println(mx);
    }
}
