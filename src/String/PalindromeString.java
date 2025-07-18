package src.String;

import java.util.Scanner;

public class PalindromeString {


    //First Way ---> Using Two Pointer
//    public static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//
//        return true;
//    }

//    Second Way Using For Loop
//    public static boolean isPalindrome(String str) {
//        String reverse = "";
//        for (int i =str.length() -1 ; i>=0; i--){
//            reverse += str.charAt(i);
//        }
//        if (str.equals(reverse)){
//            System.out.println("String is Palindrome");
//        }else {
//            System.out.println("String is Not a Palindrome");
//        }
//        return true;
//    }


//     Thrird Way --> Using StringBuilder
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        if (isPalindrome(str)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is Not a Palindrome");
        }
    }

}
