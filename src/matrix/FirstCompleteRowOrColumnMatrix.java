package src.matrix;

import java.util.HashMap;

public class FirstCompleteRowOrColumnMatrix {

        public  static  int firstCompleteIndex(int[] arr, int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            int[] rowCount = new int [n] ; // initial value =0
            int[] colCount = new int [m];

            HashMap<Integer, int[]> map= new HashMap<>();
            for(int i = 0 ; i< n ; i++){
                for(int j = 0; j <m ; j++){
                    map.put(mat[i][j], new int[]{i,j});
                }
            }

            int arrLen  = n*m ;
            for(int i = 0 ; i< arrLen ; i++){
                int cell [] = map.get(arr[i]);
                rowCount[cell[0]]++;
                colCount[cell[1]]++;
                if(rowCount[cell[0]] == m || colCount[cell[1]] == n){
                    return i;// return the index of the array if all the row or column of the matrix is travelled
                }
            }
            return -1;
        }

    public static void main(String[] args) {
            int [] arr = {1,3,4,2};
            int mat[][] = {{1,4},{2,3}};
            int res = firstCompleteIndex(arr, mat);
        System.out.println("Row or Matrix of the matrix traversed in sorted path : "+ res);
    }
}
