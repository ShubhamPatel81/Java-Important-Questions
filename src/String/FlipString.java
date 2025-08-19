package src.String;

import java.util.ArrayList;

public class FlipString {
    public static int solve(String A) {
        ArrayList<String> alist=new ArrayList<>();
        int one=0;
        int zero=0;
        for(int i=0;i<A.length();i++){
            while(i<A.length() && A.charAt(i)=='1'){
                one++;
                i++;
            }
            if(one>0){
                alist.add(""+one);
                one=0;
            }
            while(i<A.length() && A.charAt(i)=='0'){
                zero++;
                i++;
            }
            if(zero>0){
                alist.add(zero+"o");
                zero=0;
            }
            i=i-1;
        }
        int max=0;
        for(int i=0;i<alist.size();i++){
            int count=0;
            if(alist.get(i).charAt(alist.get(i).length()-1)=='o'){
                count+=Integer.valueOf(alist.get(i).substring(0,alist.get(i).length()-1));
                if(i!=0){
                    count+=Integer.valueOf(alist.get(i-1).substring(0,alist.get(i-1).length()));
                }
                if(i!=alist.size()-1){
                    count+=Integer.valueOf(alist.get(i+1).substring(0,alist.get(i+1).length()));
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }

//    public static int solve1(String A) {
//        int n = A.length();
//        int totalOnes = 0;
//        for (int i = 0; i < n; i++) {
//            if (A.charAt(i) == '1') totalOnes++;
//        }
//
//        int max = 0;
//        int i = 0;
//        int leftOnes = 0;
//
//        while (i < n) {
//            if (A.charAt(i) == '1') {
//                leftOnes++;
//                i++;
//            } else {
//                // count zero block
//                int zeroCount = 0;
//                while (i < n && A.charAt(i) == '0') {
//                    zeroCount++;
//                    i++;
//                }
//
//                // count right ones
//                int rightOnes = 0;
//                int j = i;
//                while (j < n && A.charAt(j) == '1') {
//                    rightOnes++;
//                    j++;
//                }
//
//                // candidate length
//                int candidate = leftOnes + zeroCount + rightOnes;
//
//                // adjust if all ones already counted
//                if (leftOnes + rightOnes == totalOnes) {
//                    candidate = leftOnes + rightOnes;
//                }
//
//                max = Math.max(max, candidate);
//
//                // move left pointer = rightOnes (next segment of ones)
//                leftOnes = rightOnes;
//            }
//        }
//
//        return max;
//    }

    public static void main(String[] args) {
        String A = "11001000001111111010100100100110101011101101101010";
        int ans = solve(A);
        System.out.println("Total Maximum length of fliiping 1's is: "+ans);
    }
}