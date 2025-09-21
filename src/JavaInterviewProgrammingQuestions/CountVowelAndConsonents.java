package src.JavaInterviewProgrammingQuestions;

import java.util.Scanner;

public class CountVowelAndConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to count vowels and consonants : ");
        String word = sc.nextLine().toLowerCase();
        //consonants
        int vowel = 0;
        int consonant = 0;
        int size = word.length();
        for (int i = size -1; i > 0 ; i--){
            char ch = word.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u'){
                vowel++;
            }
            consonant++;
        }
        System.out.println("Total vowel is : "+vowel+" and consonants is : "+ consonant);

    }

}
