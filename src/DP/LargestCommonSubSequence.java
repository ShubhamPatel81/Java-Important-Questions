package src.DP;

// leetcode 1143
//        Input: text1 = "abcde", text2 = "ace"
//        Output: 3
//        Explanation: The longest common subsequence is "ace" and its length is 3.

public class LargestCommonSubSequence {
        public static int longestCommonSubsequence(String text1, String text2) {
            int n = text1.length();
            int m = text2.length();
            int dp[][]=new int[n+1][m+1];
            dp[0][0] = 0;
            for(int i = 1; i <n+1; i++){
                for(int j =1; j < m+1; j++){
                    if(text1.charAt(i-1) == text2.charAt(j-1)){
                        dp[i][j] = 1+ dp[i-1][j-1]; //recur(i-1, j-1, text1, text2,dp);
                        // return dp[i][j];
                    }
                    else {
                        int case1 =dp[i-1][j]; //recur(i-1, j, text1, text2,dp);
                        int case2 =dp[i][j-1]; //recur(i , j-1, text1, text2,dp);
                        dp[i][j] = Math.max(case1, case2);
                        // return dp[i][j];
                    }
                }
            }
            print(dp);
            return dp[n][m]; //recur(n, m, text1, text2,dp);
        }
        public static void print(int dp[][]){
            int n = dp.length;
            int m = dp[0].length;
            for(int  i =0;i<n ; i++){
                for(int j = 0; j <m; j++){
                    System.out.print(dp[i][j]+" , ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        String text1="abcde";
        String text2 = "ace";
        int ans = longestCommonSubsequence(text1,text2);
        System.out.println("Total Count of the subsequence is : "+ans);
    }
}
