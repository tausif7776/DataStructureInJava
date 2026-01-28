package String;

//public class MostFrequentCharacter {
//    public static char frequence(String s){
//        int n = s.length();
//        int maxfreq = -1;
//        char ans = s.charAt(0);
//        for(int i=0; i<n; i++){
//            int freq=1;
//            char ch=s.charAt(i);
//            for(int j=i+1; j<n; j++){
//                if(s.charAt(j)==ch) freq++;
//            }
//            if(freq>maxfreq){
//                maxfreq = freq;
//                ans = ch;
//            }
//            else if(freq==maxfreq && ch<ans){
//                ans = ch;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//         String s = "testsample";
//        System.out.println( frequence(s));
//
//    }
//}


import java.util.Arrays;

public class MostFrequentCharacter {
    public static char frequence(String s){
        int n=s.length()-1;
        int maxfreq=-1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i=0;
        int j=0;

        while (i<n){
            if(arr[i]==arr[j]) j++;
            else{
                int freq = j-i;
                if(freq>maxfreq){
                    maxfreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq>maxfreq){
            maxfreq=freq;
            ans=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
      String st = "character";
        System.out.println(frequence(st));
    }
}



























