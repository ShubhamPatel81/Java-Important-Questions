package src.DP;
/*
Given a string s, partition s such that every substring of the partition is a palindrome.

        Return the minimum cuts needed for a palindrome partitioning of s.



        Example 1:

        Input: s = "aab"
        Output: 1
        Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
        Example 2:

        Input: s = "a"
        Output: 0
        */
public class PalindromePartitioningII {

    // This is using Recursion method
        public static int solve(String s, int i , int j){
            int res = Integer.MAX_VALUE;
            if(i >= j ) return 0;//0 cuts
            if(isPalindrome(s,i,j)) return 0;// no cut required, its already palindrome
            for(int k = i; k < j; k++){
                int temp = 1 + solve(s,i,k) + solve(s, k+1,j);
                res = Math.min(res, temp);
            }
            return  res;
        }
        public static boolean isPalindrome(String s, int i ,int j){
            while(i <= j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
        public int minCut(String s) {
            int n = s.length();
            return solve(s, 0, n-1);
        }

}
//This is using dp
class Solution2 {
    Integer[][] dp;

    public int solve(String s, int i, int j) {
        if (i >= j) return 0;
        if (isPalindrome(s, i, j)) return 0;

        if (dp[i][j] != null) return dp[i][j];

        int res = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = 1 + solve(s, i, k) + solve(s, k + 1, j);
            res = Math.min(res, temp);
        }
        return dp[i][j] = res;
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public int minCut(String s) {
        int n = s.length();
        dp = new Integer[n][n];
        return solve(s, 0, n - 1);
    }
}
class Solution3 {
    public int minCut(String s) {
        int n = s.length();
        // Blue print
        boolean [][] t = new boolean[n][n];
        //t[i][j]  true/false (s[i...j] substing is palindrome or not)

        //Length = 1 , substring
        for(int i = 0; i < n ;i++){
            t[i][i]  = true;// diagonal is alwaya a plaindrome, represent one char
        }


        //Length >= 2 substring
        for(int L = 2; L <= n ; L++){
            for(int i =0 ; i < n-L+1; i++){
                int j = i + L -1;
                if(L ==2) {// string of size 2 only
                    t[i][j] = (s.charAt(i)== s.charAt(j));
                }
                else{
                    t[i][j] = (s.charAt(i) == s.charAt(j) && t[i+1][j-1]);
                }

            }
        }



        int [] dp = new int[n];
        //dp[i] = min cuts required to cut a string s[0...i] into palindrome
        for(int i = 0; i<n ; i++){
            if(t[0][i] == true){// s[0..i] is palindrom
                dp[i]=0;// no cuts requried
            }else{
                dp[i] =Integer.MAX_VALUE;
                for(int  k =0; k < i; k++){
                    if(t[k+1][i] ==true && 1+dp[k]< dp[i]){
                        dp[i] = 1 + dp[k];
                    }
                }
            }
        }
        return dp[n-1];//s[0...n-1] entire string min cuts required to split into palindrome only
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String str = " aab";
        int ans = s.minCut(str);
        System.out.println("Minimum cuts required : "+ans);
    }
}
