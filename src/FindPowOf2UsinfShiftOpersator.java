package src;

import java.util.Scanner;

public class FindPowOf2UsinfShiftOpersator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the power: ");
        int n = sc.nextInt();

        int pow = 1 << n;
        System.out.println("The power of 2 of the number is: "+ pow);

    }
}
