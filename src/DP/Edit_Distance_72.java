package src.DP;

/*
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

        You have the following three operations permitted on a word:

        Insert a character
        Delete a character
        Replace a character


        Example 1:

        Input: word1 = "horse", word2 = "ros"
        Output: 3
        Explanation:
        horse -> rorse (replace 'h' with 'r')
        rorse -> rose (remove 'r')
        rose -> ros (remove 'e')
*/


/*  // This is using recursion
public class Edit_Distance_72 {
        public static int solve(String s1, String s2, int i, int j) {
            int m = s1.length();
            int n = s2.length();

            if (i == m) return n - j;
            if (j == n) return m - i;

            if (s1.charAt(i) == s2.charAt(j)) {
                return solve(s1, s2, i + 1, j + 1);
            } else {
                int insert = 1 + solve(s1, s2, i, j + 1);
                int delete = 1 + solve(s1, s2, i + 1, j);
                int replace = 1 + solve(s1, s2, i + 1, j + 1);
                return Math.min(insert, Math.min(delete, replace));
            }
        }

        public int minDistance(String s1, String s2) {
            return solve(s1, s2, 0, 0);
        }
}
*/

import java.util.Arrays;

// This is using DP -> Memoization
public class Edit_Distance_72 {
        int[][] dp;

        public int solve(String s1, String s2, int i, int j) {
            int m = s1.length();
            int n = s2.length();

            if (i == m) return n - j;
            if (j == n) return m - i;

            if (dp[i][j] != -1) return dp[i][j];

            if (s1.charAt(i) == s2.charAt(j)) {
                dp[i][j] = solve(s1, s2, i + 1, j + 1);
            } else {
                int insert = 1 + solve(s1, s2, i, j + 1);
                int delete = 1 + solve(s1, s2, i + 1, j);
                int replace = 1 + solve(s1, s2, i + 1, j + 1);
                dp[i][j] = Math.min(insert, Math.min(delete, replace));
            }
            return dp[i][j];
        }

        public int minDistance(String s1, String s2) {
            dp = new int[s1.length()][s2.length()];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            return solve(s1, s2, 0, 0);
        }

    public static void main(String[] args) {
        Edit_Distance_72 e = new Edit_Distance_72();
        String word1 = "horse";
        String word2 = "ros";
        int ans = e.minDistance(word1, word2);
        System.out.println("the minimum number of operations required to convert word1 to word2 : "+ans);
    }

}
