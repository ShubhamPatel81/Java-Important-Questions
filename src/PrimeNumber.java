package src;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = 0;
        if (num <2) {
            System.out.println("Prime number is: "+num);
        }
        for (int i = 2; i<num ;i++){
            if (num %i == 0){
                temp++;
            }

        }
        if (temp >0){
            System.out.println("Number is Not prime Number ");
        }else {
            System.out.println("Number is Prime number ");
        }
System.err.println("This is an System.err.println() example ");
    }
}
