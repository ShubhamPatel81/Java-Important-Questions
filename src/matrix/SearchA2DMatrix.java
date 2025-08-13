package src.matrix;

public class SearchA2DMatrix {

    // Using Binary Search Method  TC = log(m*n)
    public  static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 ) return false;
        int m = matrix.length;
        int n= matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        while(start <= end){

            int mid = start + (end - start)/2;
            int r = mid/n; // Row = Index / Column Size
            int c = mid % n; // Column = Index % Column Size
            int val =matrix[r][c];

            if(val == target) return true;
            else if( target < val) end = mid -1;
            else start  = mid + 1;
        }
        return false;
    }

    //Using Linear Search
    public  static boolean searchMatrixLineraly(int [][] matrix ,int target){
        int n = matrix.length;
        for (int i = 0 ; i  < n ; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == target) {
                    System.out.println("Target Found in the Matrix at index : "+ matrix[i][j]);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean searchMatrixIn2d(int[][] matrix, int target) {
//        ntegers in each row are sorted in ascending from left to right.
//        Integers in each column are sorted in ascending from top to bottom.
//        matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
//        target = 5
        if(matrix.length == 0) return false;
        int rows  = matrix.length;
        int col = matrix[0].length;
        int r = 0 ;
        int c = col - 1;

        while(r < rows && c >=0){
            if(matrix[r][c] == target) return true;
            else if(target < matrix[r][c]){
                c = c -1;
            }else{
                r = r + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
     int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
     int target = 3;
     System.out.println(searchMatrix(matrix, target));
     System.out.println(searchMatrixLineraly(matrix,target));
    }
}
