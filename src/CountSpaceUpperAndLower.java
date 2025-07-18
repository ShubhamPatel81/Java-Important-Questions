package src;

import java.util.Scanner;

public class CountSpaceUpperAndLower {
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        int spaceCount =0;
        int lowerCount= 0;
        int upperCount= 0;
        int otherCount=0;

        for (int i = 0 ; i <str.length();i++){
           char ch= str.charAt(i);
           if (ch==32){
               //space count++
               spaceCount++;
           }
           else if (ch>=97 && ch<=122){
               //lower case count ++
               lowerCount++;
           }
           else if (ch>=65 && ch<=90){
               // capital latter count ++
               upperCount++;
           }
           else {
               // other characters
               otherCount++;
           }
        }
        System.out.println("Space: "+spaceCount);
        System.out.println("Lower Count : "+ lowerCount);
        System.out.println("Upper Count : "+ upperCount);
        System.out.println("Other count : "+otherCount);
    }
}
