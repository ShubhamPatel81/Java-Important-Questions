package src.Arrays;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {

//        for(int  row =1 ; row <= 30; row++ ){
//            for (int col = 1 ; col <= row ; col++){
//                char name  = (char) ('a' + (row-1));
//                System.out.print(name +" ");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length for printing star : ");
        int len = sc.nextInt();
        for (int i = 1; i <= len; i++) {
            for (int j = i; j <= len; j++) {
                System.out.print(" ");
            }
//            System.out.println(" *");
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
