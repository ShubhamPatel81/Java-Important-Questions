package src.Competative_Programming.NumberTheoryAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Factors {
    public static void printFactors(int n){

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i*i<= n; i++){
            if (n %i == 0){
                list.add(i);
                if (i != (n/i)){
                    list.add(n/i);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factor: ");
        int n=  sc.nextInt();
        printFactors(n);
    }
}
