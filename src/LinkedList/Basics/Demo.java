package LinkedList.Basics;


import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static boolean sumMin(List<Integer> arr) {

        /*
        int minSum = 0;

        for(int i=0; i<=arr.size()-2; i++) {
            minSum += arr.get(i);
        }
        return minSum;
    }

    public static int SumMax(List<Integer> arr) {

        int maxSum = 0;
        for(int i=1; i<=arr.size()-1; i++) {
            maxSum += arr.get(i);
        }
        return maxSum;

         */

        Long totalSum = 0L;
        for (int num : arr) {
            totalSum += num;
        }

        Long min  = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;

        for(int num : arr) {
            Long sum = totalSum - num;
            if(sum < num) {
                min = sum;
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(min+ " " +max);
        return false;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        System.out.println(sumMin(list));
    }
}
