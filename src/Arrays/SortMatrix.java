package src.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the size of the matrix: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [][] matrix= new int[size][size];
       System.out.println("Enter the " + size * size + " elements for the matrix: ");
        for (int i = 0; i< size; i++){
            for (int j = 0 ; j < size ; j++){
                System.out.println("Enter ["+i+"]["+j+"] : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //Printing  Original matrix
        System.out.println("Original matrix is : ");
        for (int i = 0 ; i< size; i++){
            for (int j = 0 ; j < size; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



        // Convert the matrix into flat matrix
        int[] flatMatrix= new int[size* size];
        int index = 0;
        for (int i = 0 ; i< size; i++){
            for (int j = 0 ; j< size; j++){
                flatMatrix[index++] = matrix[i][j];

            }

        }
        // Printing FlatMatrix
        System.out.print("FlatMatrix is: ");
        for (int i : flatMatrix){
            System.out.print(i+" ");
        }

        //Sort it in one dimensional
        Arrays.sort(flatMatrix);

        // convert back into matrix
         index = 0;
         for (int i = 0 ;i < size; i++){
             for (int j = 0 ; j< size; j++){
                 matrix[i][j]= flatMatrix[index++];
             }
         }

        System.out.println();
         // print the sorted matrix
        System.out.println("The sorted matrix is : ");
         for (int i = 0 ; i < size; i++){
             for (int j = 0  ; j< size; j++){
                 System.out.print(matrix[i][j]+" ");
             }
             System.out.println();
         }
        sc.close();

    }
}

