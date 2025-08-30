package src.SlidingWindow;

import java.util.Arrays;

public class CountOccurenceOfAnagram {
    public static int search(String s, String pattern) {
        int n = s.length();
        int k = pattern.length();

        if (k > n) return 0;

        // build pattern frequency
        int[] patternFreq = new int[26];
        for (int i = 0; i < k; i++) {
            int index = pattern.charAt(i) - 'a';
            patternFreq[index]++;
        }

        // build initial window frequency
        int[] windowFreq = new int[26];
        for (int i = 0; i < k; i++) {
            int index = s.charAt(i) - 'a';
            windowFreq[index]++;
        }

        int count = 0;
        if (Arrays.equals(patternFreq, windowFreq)) {
            count++;
        }

        // slide the window across string s
        for (int i = k; i < n; i++) {
            int newCharIndex = s.charAt(i) - 'a';       // char entering window
            int oldCharIndex = s.charAt(i - k) - 'a';   // char leaving window

            windowFreq[newCharIndex]++;
            windowFreq[oldCharIndex]--;

            if (Arrays.equals(patternFreq, windowFreq)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "forxxorfxdofr";
        String pattern = "for";
        int ans = search(s, pattern);
        System.out.println("Count Occurence of Anagram is : " + ans);
    }
}
