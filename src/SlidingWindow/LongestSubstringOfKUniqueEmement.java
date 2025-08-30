package src.SlidingWindow;

import java.util.Map;

public class LongestSubstringOfKUniqueEmement {

    public static int longestKSubstring(String s, int k){
        int n=s.length();
        int windowStart=0;
        int windowEnd = 0;
        int len = 0;
        int uniqueChar =0;
        int maxLen = Integer.MIN_VALUE;
        int freqHash [] = new int[26];
        while (windowEnd <n){
            int index = s.charAt(windowEnd)-97;
            if (freqHash[index] == 0){
                uniqueChar++;
                freqHash[index]++;
            }
            else {
                freqHash[index]++;
            }
            if (uniqueChar == k){
                len = windowEnd - windowStart+1;
                maxLen = Math.max(maxLen,len);
            }
            //shrinking
            else if (uniqueChar > k){
                while (windowStart<windowEnd && uniqueChar > k){
                    index = s.charAt(windowStart)-97;
                    windowStart++;
                    freqHash[index]--;
                    if (freqHash[index] ==0){
                        uniqueChar --;
                    }
                }
            }
            windowEnd++;
        }
        return (maxLen ==Integer.MIN_VALUE)?-1:maxLen;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k =3;
        int ans=  longestKSubstring(s,k);
        System.out.println(" Longest substring of K unique elements is : "+ans);
    }
}
