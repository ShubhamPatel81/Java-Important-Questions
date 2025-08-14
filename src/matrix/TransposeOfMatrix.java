package src.matrix;

public class TransposeOfMatrix {

    //In transpose of a matrxi ->
    // just swap the elements above or below of the diagonals

    public static  void  swap(int[][]matrix, int i , int j ){
        int temp =matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static  void transpose(int[][] matrix,int n ) {
        for (int i= 0 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++){
                swap(matrix, i,j);
            }
        }
    }
}
