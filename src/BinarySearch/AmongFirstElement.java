package BinarySearch;

public class AmongFirstElement {
    public static int among(int[] arr){
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n-1] != arr[n-2]){
            return arr[n-1];
        }
        int lo=0;
        int hi=n-1;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            int f=mid;
            int s=mid;
            if(arr[mid-1] == arr[mid]){
                f=mid - 1;
            }
            else{
                s = mid + 1;
            }
            int leftcount = f-lo;
            int highcount = hi-s;
            if(leftcount%2 == 0){
                lo = s + 1;
            }
            else {
                hi = f-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = {1, 1, 2, 2, 3, 3, 4};
        System.out.println(among(arr));
    }
}
