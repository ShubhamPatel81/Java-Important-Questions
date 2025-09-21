package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String word = sc.nextLine();
        checkWord(word);
        System.out.println("Enter the Number to check : ");
        int n = sc.nextInt();
        checkNumber(n);
    }
    public static void checkWord(String word){
        // aabaa
        int size = word.length();
        String res ="";
        for (int i = size-1; i>=0 ;i-- ){
            char ch  = word.charAt(i);
            res += ch;
        }
        if ( res.equals(word)){
            System.out.println("Word is Palindrome");
        }else {
            System.out.println("Word is not Palindrome");
        }
    }
    public static void checkNumber(int n){
        int temp =0;
        int original=n;
        //121
        while (n > 0){
            int rem  = n % 10;//2
            temp = temp * 10 + rem;
            n = n/10;
        }
        if(original == temp) System.out.println("Number is Palindrome");
        else System.out.println("Number is Not Palindrome");
    }
}
