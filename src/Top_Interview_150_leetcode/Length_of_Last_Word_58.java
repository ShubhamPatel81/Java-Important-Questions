package src.Top_Interview_150_leetcode;
//Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.
public class Length_of_Last_Word_58 {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Length_of_Last_Word_58 l = new Length_of_Last_Word_58();
        String s = "Hello World";
        int ans = l.lengthOfLastWord(s);
        System.out.println("The length of the last word is : "+ ans);
    }
}
