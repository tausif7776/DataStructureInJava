package LeetCode;

public class CountPrime {
        public static int primeCount(int n){
            if(n<2){
                return 0;
            }
            boolean[] result = new boolean[n];
            int limit = (int)Math.sqrt(n);
            for(int i=2; i<=limit; i++){
                if(!result[i]){
                    for(int j=i*i; j<n; j+=i){
                        result[j] = true;
                    }
                }
            }
            int count=0;
            for(int i=2; i<n; i++){
                if(!result[i]){
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            int n=15;
            System.out.println(primeCount(n));

        }
    }

