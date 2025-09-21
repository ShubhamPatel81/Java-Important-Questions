package src.JavaInterviewProgrammingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.print("Enter the String 2: ");
        String s2 = sc.nextLine().toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("This is an Anagram");
        } else {
            System.out.println("This is not an Anagram");
        }
    }
}


//       int Compare = s1.compareTo(s2);
//       if (Compare ==0){
//           System.out.println("The Input String is Anagram ");
//       }else {
//           System.out.println("The input Number is not an Angram");
//       }


