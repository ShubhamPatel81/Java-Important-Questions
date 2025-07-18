package src.BackTracking;

public class MazePath {
    public static void main(String[] args) {
        int rows =2;
        int cols = 3;
        int count =maze(01,1,rows,cols);
        System.out.println(count);
    }
    private static  int maze(int stRow, int stCol, int enRow, int enCol){
        if (stRow>enRow || stCol>enCol) return 0;
        if (stRow==enRow && stCol == enCol) return 1;
        int downWays = maze(stRow+1,stCol, enRow,enCol);
        int rightWays = maze(stRow, stCol+1,enRow,enCol);

        int   totalways=downWays+rightWays;
            return  totalways;
    }
}
