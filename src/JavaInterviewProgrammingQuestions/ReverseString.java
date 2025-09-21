package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Original Word: "+word);
        String ans =reverseWithoutInBuilt(word);
        System.out.println("Reverse without in-build method :"+ans);
        System.out.println("Reverse Using build-in: "+reverseWithInbuilt(word));

    }
    public static String reverseWithoutInBuilt(String word){
        //asas
        int size = word.length();
        String reverse ="";
        for (int i = size-1; i >=0 ; i--){
            char ch = word.charAt(i);
            reverse += ch;
        }
        return reverse ;
    }
    public static String  reverseWithInbuilt(String word){
        StringBuilder sb = new StringBuilder();
        return sb.append(word).reverse().toString();
    }
}

