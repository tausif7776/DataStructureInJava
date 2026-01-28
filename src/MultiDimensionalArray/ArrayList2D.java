package MultiDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(22); a.add(93); a.add(55);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(74); b.add(11); b.add(13);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(17); c.add(19); c.add(21);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

//
//        for(int i=0; i<arr.size(); i++){
//            for(int j=0; j<arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j)+ " ");
//            }
//            System.out.println();
//        }

        arr.add(new ArrayList<>());
       arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);
        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
}
