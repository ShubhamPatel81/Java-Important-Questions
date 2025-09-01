package src.Top_Interview_leetcode;

//Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
public class Valid_Palindrome_125   {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length()-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama" ;
        Valid_Palindrome_125 v = new Valid_Palindrome_125();
        System.out.println("Checking the valid palindrome or not : " +  v.isPalindrome(s));
    }
}
