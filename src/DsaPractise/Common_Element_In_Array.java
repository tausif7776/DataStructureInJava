package DsaPractise;

import java.util.ArrayList;

public class Common_Element_In_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6};
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    ans.add(arr1[i]);
                }
            }
        }
        System.out.println("Common Elements: " +ans);
    }
}