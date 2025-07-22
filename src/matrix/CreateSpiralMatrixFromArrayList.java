package src.matrix;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public  class CreateSpiralMatrixFromArrayList {
    // * Definition for singly-linked list.
    static class  ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values){
            ListNode node = new ListNode(0);
            ListNode current = node;
            for (int val : values){
                current.next = new ListNode(val);
                current = current.next;
            }
            return node.next;

    }
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][] = new int [m][n];
        for(int i = 0; i< m ; i++){
            Arrays.fill(matrix[i],-1);
        }

        int topRow = 0 , bottomRow = m-1,leftCol = 0 , rightCol=n-1;
        while(head != null){
            for(int col = leftCol ; col<=rightCol; col++){
                if(head == null )break;
                matrix[topRow][col] = head.val;
                head =head.next;
            }
            topRow++;
            // top to bottom
            for (int row = topRow; row <= bottomRow && head != null; row++) {
                matrix[row][rightCol] = head.val;
                head = head.next;
            }
            rightCol--;
            for(int col = rightCol ; col >= leftCol ; col--){
                if(head == null ) break;
                matrix[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;
            for(int row = bottomRow; row >= topRow; row--){
                if(head == null) break;
                matrix[row][leftCol] = head.val;
                head = head.next;
            }
            leftCol++;
        }
        return matrix;
    }

    // Print matrix utility
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m = 3, n =5;
        int[] values = {3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0};
        ListNode head = createList(values);
      int[][] result =  spiralMatrix(m,n,head);
      printMatrix(result);
    }
}