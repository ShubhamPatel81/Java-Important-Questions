package src;

import java.util.Scanner;

public class UpperCaseInReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter : ");
        String  letter = sc.nextLine().toUpperCase();

        System.out.println("Letter is : "+ letter.toUpperCase());

        String  newLetter="";
        for (int i =letter.length()-1; i>=0;i--){
            newLetter +=letter.charAt(i);
        }
        System.out.println("Reversed letter is : "+newLetter);




        System.out.print("Reversed the letters from z to that letter: ");
        char l = sc.next().charAt(0);
        for (char i = 'z' ; i >= l;i--){
            System.out.print(i+" ");
        }
    }
}
