package src.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubString {
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> freqMap = new HashMap<>();

        //populate the map with t string
        for(int i = 0 ; i < t.length();i++){
            char ch = t.charAt(i);
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        int uniqueCharCount = freqMap.size();
        int startIndex = -1;
        int windowStart =0;
        int windowEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int N = s.length();
        while(windowEnd < N){
            char ch = s.charAt(windowEnd);
            //Expension Phase
            if(freqMap.containsKey(ch)){
                freqMap.put(ch,freqMap.get(ch)-1);
                if(freqMap.get(ch) == 0){
                    uniqueCharCount--;
                }
            }
            // shrinking phase
            while(uniqueCharCount ==0 ){
                // find length
                int len = windowEnd - windowStart +1;
                if(len< minLen){
                    minLen = len;
                    startIndex = windowStart;
                }
                ch = s.charAt(windowStart);
                if(freqMap.containsKey(ch)){
                    freqMap.put(ch,freqMap.get(ch)+1);
                    if(freqMap.get(ch)>0){
                        uniqueCharCount++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }
        if(startIndex == -1) return "";
        return s.substring(startIndex,startIndex+minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = minWindow(s,t);
        System.out.println("The minimum window substring \"BANC\" includes 'A', 'B', and 'C' from string t.");
        System.out.print(ans);

    }
}
