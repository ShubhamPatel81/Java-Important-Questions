package src.Top_Interview_150_leetcode;

public class Is_Subsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        Is_Subsequence_392 i =new Is_Subsequence_392();
        System.out.println("Checking the substring is : "+i.isSubsequence(s,t));

    }
}
