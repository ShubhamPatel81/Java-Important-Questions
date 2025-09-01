package src.Top_Interview_leetcode;

//Input: s = "the sky is blue"
//        Output: "blue is sky the"
public class Reverse_Words_in_a_String_151 {
    public String reverseWords(String s) {
        String [] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i>=0 ; i--)
        {
            sb.append(words[i]);
            if(i != 0){
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Reverse_Words_in_a_String_151 r = new Reverse_Words_in_a_String_151();
        String s = "the sky is blue";
        String ans = r.reverseWords(s);
        System.out.println("The reverse of the String is : "+ ans);
    }
}
