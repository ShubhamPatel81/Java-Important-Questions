package src.DP;
//
//Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences.
// If there are multiple valid strings, return any of them.
//
//        A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.
//
//


public class ShortestCommonSupersequence {
        public static String shortestCommonSupersequence(String str1, String str2) {
            int dp[][] = longestCommonSubsequence(str1, str2);
            int i = str1.length();
            int j = str2.length();
            StringBuilder sb = new StringBuilder();

            while (i > 0 && j > 0) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    sb.append(str1.charAt(i - 1));
                    i--;
                    j--;
                } else if (dp[i - 1][j] > dp[i][j - 1]) {
                    sb.append(str1.charAt(i - 1));
                    i--;
                } else {
                    sb.append(str2.charAt(j - 1));
                    j--;
                }
            }

            while (i > 0) {
                sb.append(str1.charAt(i - 1));
                i--;
            }

            while (j > 0) {
                sb.append(str2.charAt(j - 1));
                j--;
            }

            return sb.reverse().toString();
        }

        public static int[][] longestCommonSubsequence(String text1, String text2) {
            int n = text1.length();
            int m = text2.length();
            int dp[][] = new int[n + 1][m + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            return dp;
        }

    public static void main(String[] args) {
        String str1 ="abac";
        String str2 = "cab";
        System.out.println(shortestCommonSupersequence(str1,str2));

    }
}
