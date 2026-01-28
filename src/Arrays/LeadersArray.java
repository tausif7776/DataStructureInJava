package Arrays;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//
//public class LeadersArray {
//    static ArrayList<Integer> leaderArray(int[] arr){
//        ArrayList<Integer> list = new ArrayList<>();
//
//        int n = arr.length;
//        int max = arr[n-1];
//        list.add(max);
//
//        for(int i=n-2; i>=0; i--){
//            if(arr[i] > max){
//                max = arr[i];
//                list.add(max);
//            }
//        }
//        Collections.reverse(list);
//        return list;
//    }
//    public static void main(String[] args) {
//        int[] arr = {16, 17, 4, 3, 5, 2};
//        System.out.println(leaderArray(arr));
//    }
//}


import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;

public class LeadersArray {
    static ArrayList<Integer> leader(int[] arr){
        int n = arr.length;
        ArrayList<Integer> leader = new ArrayList<>();
        int mx = arr[n-1];
        leader.add(mx);

        for(int i=n-2; i>=0; i--){
            if(arr[i] > mx){
                mx = arr[i];
                leader.add(mx);

            }
        }
        Collections.reverse(leader);
        return leader;
    }
    public static void main(String[] args) {
       int[] arr = {2, 7, 9, 4, 6, 3};
        System.out.println(leader(arr));
    }
}




















