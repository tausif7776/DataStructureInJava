package LeetCode;

import java.util.Arrays;

public class PlusOneArray {
        public static int[] plusOne(int[] arr){
            int n = arr.length;
            for(int i=n-1; i>=0; i--){
                if(arr[i] < 9){
                    arr[i]++;
                    return arr;
                }
            }
            int[] newArr = new int[n+1];
            newArr[0] = 1;
            return newArr;
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            System.out.println(Arrays.toString(plusOne(arr)));
        }
    }
