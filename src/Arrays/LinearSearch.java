package Arrays;

public class LinearSearch {
    public static void main(String[] args) {

//        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
//        int key = 6;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == key){
//                System.out.println("index = " +i);
//            }
//        }



        int[] arr = {3, 5, 6, 9, 1, 2,10};
        int key=11;
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
    }
}
