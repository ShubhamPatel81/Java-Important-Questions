package src.Top_Interview_leetcode;

public class FindtheIndexoftheFirstOccurrenceinaString_28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int heyLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= heyLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        FindtheIndexoftheFirstOccurrenceinaString_28 finder = new FindtheIndexoftheFirstOccurrenceinaString_28();
        int result = finder.strStr(haystack, needle);

        System.out.println("The index of the first occurrence of \"" + needle + "\" in \"" + haystack + "\" is: " + result);
    }
}
