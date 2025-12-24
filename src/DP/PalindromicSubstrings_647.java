package src.DP;


//Given a string s, return the number of palindromic substrings in it.
// Example input= "aaa"  , output = 6
// input  = "abc" , output = 3
public class PalindromicSubstrings_647 {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

//        "aaaaa"
        for (int i = 0 ; i < n; i++ ){
            for (int j = i; j <n; j++){
                if (check(s, i , j )){
                    count++;
                }
            }
        }

        return count;
    }

    private boolean check(String s, int i, int j) {
        if (i >= j) return  true;
        if (s.charAt(i) == s.charAt(j)) return check(s, i+1, j-1);
        return false;
    }

    public static void main(String[] args) {
        PalindromicSubstrings_647 p = new PalindromicSubstrings_647();
        String str = "aaa";
        int ans = p.countSubstrings(str);
        System.out.println("Given a string s, return the number of palindromic substrings is :  "+ ans);
    }
}
class Solution {

    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] t = new boolean[n][n];
        int count = 0;

        // length of substring
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (i == j) {
                    t[i][j] = true; // single character
                } else if (i + 1 == j) {
                    t[i][j] = (s.charAt(i) == s.charAt(j)); // two characters
                } else {
                    t[i][j] = (s.charAt(i) == s.charAt(j)) && t[i + 1][j - 1];
                }

                if (t[i][j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "aaa";
        int ans = s.countSubstrings(str);
        System.out.println("Panindrome substring count is : " +ans);
    }
}

