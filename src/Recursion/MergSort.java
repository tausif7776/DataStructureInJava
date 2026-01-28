package Recursion;

import java.util.Arrays;

public class MergSort {
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // Create 2 new empty arrays of size n/2 each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // step 2 : arr into a and b
        int idx = 0;
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];
        //  step 3 : Magic
        mergeSort(a);
        mergeSort(b);
        // step 4 merge
        merge(a, b, arr);
    }
    public static void merge(int[]a, int[]b, int[]c){
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(i<b.length) c[k++] = b[i++];
    }
    public static void main(String[] args) {
       int[] arr = {3, 4, 2, 1, 5, 6, 7, 8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
