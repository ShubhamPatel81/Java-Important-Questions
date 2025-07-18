package src.String;

import com.sun.jdi.request.StepRequest;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str= sc.nextLine();

        //str= "hello"
        char[] arr= str.toCharArray();
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        String rev ="";

        for (int i = arr.length-1; i >=0 ; i--){
            rev+=arr[i];
        }
        System.out.println("Reverse of String : " + rev);
        StringBuilder sb = new StringBuilder();
        System.out.println("Using String Builder: "+sb.append(str).reverse().toString());

        // another word
        String reverse ="";
        for (int i =str.length()-1; i>=0 ;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("This is reverse using charAt(i) for loop "+ reverse);


        // java is funny --> reverse this word

        System.out.print("Input the Word : ");
        String word = sc.nextLine();
        System.out.print("The Word is : "+ word);
        String reveredWord= "";
        for (int i = word.length()-1; i>=0 ; i--){
            reveredWord+=word.charAt(i);
        }
        System.out.println();
        System.out.println("Reversed of the String word is : "+ reveredWord);



       String  arrayWord[] = word.split(" ");
       String reverseWordAns = "";
       for (int i = arrayWord.length-1; i>=0 ; i--){
           reverseWordAns+= arrayWord[i];
           reverseWordAns+=" ";
       }
        System.out.println("This is the word reverse : "+ reverseWordAns);

    }
}
