package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneNumber {
    ArrayList<Integer> addOne(int[] arr){
    ArrayList<Integer> result = new ArrayList<>();
    int carry=1;
    for(int i=arr.length-1; i>=0; i--){
        if(arr[i]+carry <= 9){
            result.add(arr[i]+carry);
            carry=0;
        }

        else{
            result.add(0);
            carry=1;
        }
    }
    if(carry==1) result.add(1);
    Collections.reverse(result);
    return result;
    }
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        AddOneNumber num = new AddOneNumber();
        ArrayList<Integer> result = num.addOne(arr);
        System.out.println(result);
    }
}
