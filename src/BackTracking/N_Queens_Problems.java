//package src.BackTracking;
//
//public class N_Queens_Problems {
//    public static void main(String[] args) {
//        int n=4;
//        char[][] board= new char[n][n];
//
//        for (int i = 0 ; i< n ;i++){
//            for (int j = 0; j < n ; j++){
//                board[i][j] = 'X';
//            }
//        }
//        nqueens(board,0);
//    }
//
//    private static void nqueens(char[][] board, int row) {
//        int n = board.length;
//        if (row ==n){
//            for (int i = 0 ; i< n ;i++){
//                for (int j = 0; j < n ; j++){
//                    System.out.print(board[i][j]);
//                }
//                System.out.println();
//            }
//            return;
//        }
//        for (int j =0 ; j<n ;j++){
//            if (isSafe(board,row,j)) {
//                board[row][j]= 'Q';
//                nqueens(board, row+1);
//                board[row][j]= 'X';//backtracking
//            }
//        }
//    }
//
//    private static boolean isSafe(char[][] board, int row, int col) {
//        //check the row
//        for (int j= 0 ;j<n; j++ ){
//            if (board[row][j])
//        }
//    }
//}
