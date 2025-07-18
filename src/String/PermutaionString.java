package src.String;

import java.util.Scanner;

public class PermutaionString {


        public static void permutation(String str, String result){
            int n  = str.length();
            if(n ==0){
                System.out.print(result +" ");
                return ;
            }
            for(int i = 0 ; i< n; i++){
                char c = str.charAt(i);
                String rem = str.substring(0,i)+str.substring(i+1);
                permutation(rem, result+c);
            }
            // System.out.print(rem);

        }


        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string : ");
            String str = sc.nextLine();

            System.out.print("Permutation is: ");
            permutation(str, "");

        }
}

