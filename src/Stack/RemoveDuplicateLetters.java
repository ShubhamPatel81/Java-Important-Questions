package src.Stack;
import  java.util.Stack;

public class RemoveDuplicateLetters {

        public static String removeDuplicateLetters(String s) {
            Stack<Character> stack = new Stack<>();
            int freq[] = new int[26];
            boolean exist[] = new boolean[26];

            // Count frequency of each character
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                freq[ch - 'a']++;
            }

            // Main logic to build the result
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                freq[ch - 'a']--;
                if (exist[ch - 'a']) continue;  // Skip if character already exists in stack

                // Maintain lexicographical order and remove characters if necessary
                while (!stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0) {
                    char remender = stack.pop();
                    exist[remender - 'a'] = false;
                }

                stack.push(ch);
                exist[ch - 'a'] = true;
            }

            // Build the result from the stack
            char ans[] = new char[stack.size()];  // Corrected this line
            int i = ans.length - 1;
            while (i >= 0) ans[i--] = stack.pop();

            return new String(ans);
        }

    public static void main(String[] args) {
        String s = "asdadaas";
        String ans = removeDuplicateLetters(s);
        System.out.println("Duplicate String is :  "+ s );
        System.out.println("After Removing Duplicate, String is : "+ ans);
    }
    }


