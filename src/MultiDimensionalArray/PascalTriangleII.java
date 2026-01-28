//package MultiDimensionalArray;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PascalTriangleII {
//        public List<List<Integer>> generate(int n){
//            int reult = n + 1;
//            List<List<Integer>> ans = new ArrayList<>();
//            for(int i=0; i<n; i++){
//                ans.add(new ArrayList<>());
//                for(int j=0; j<=i; j++){
//                    if(j==0 || j==i ) ans.get(i).add(1);
//                    else{
//                        int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
//                        ans.get(i).add(val);
//                    }
//                }
//            }
////            return ans.get(n);
//        }
//        public static void main(String[] args) {
//            int n = 5;
//            MultiDimensionalArray.PascalTriangle pt = new MultiDimensionalArray.PascalTriangle();
//            List<List<Integer>> triangle = pt.generate(n);
//
//            for(List<Integer> row : triangle){
//                System.out.println(row);
//            }
//
//        }
//    }


