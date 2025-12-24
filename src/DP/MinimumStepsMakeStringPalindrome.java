package src.DP;
/*
Input: s = "mbadm"
        Output: 2
        Explanation: String can be "mbdadbm" or "mdbabdm".
*/
public class MinimumStepsMakeStringPalindrome {
    public static void main(String[] args) {
        String s = "mbadm";
        int ans = minInsertions(s);
        System.out.println("the minimum number of steps to make s palindrome :" +ans);
    }

    private static int minInsertions(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];
        for (int i = 0 ;i < n ; i++){
            for (int j = 0 ;j < n ; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0, n-1, s, dp);
    }

    private static int solve(int i, int j, String s, int[][] dp) {
            if (i >= j) return 0;
            if (dp[i][j] != -1 )return dp[i][j];
            if (s.charAt(i) == s.charAt(j)){
                dp[i][j] = solve(i+1, j-1, s, dp);
            }else {
                dp[i][j] =  1 + Math.min(
                        solve(i+1, j, s, dp),solve(i, j-1, s, dp)
                );
            }
            return dp[i][j];
    }
}

class Solution1 {
    public int minInsertions(String s) {
        int n = s.length();
        int [][] dp = new int[n][n];

        for(int L = 2; L <= n ; L++){
            for(int i = 0; i < n- L +1; i++){
                int j = i + L - 1;
                if(s.charAt(i) == s.charAt(j)) dp[i][j] = dp[i+1][j-1];
                else{
                    dp[i][j] = 1 + Math.min(dp[i][j-1], dp[i+1][j]);
                }
            }
        }
        return  dp[0][n-1];
    }

    public static void main(String[] args) {
        String str = "maddm";
        Solution s = new Solution();
        int ans = s.countSubstrings(str);
        System.out.println("Count minimum steps to make String as palindrome is : " +ans);
    }
}
