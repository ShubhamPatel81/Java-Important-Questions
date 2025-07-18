package src.BackTracking;

public class printMazeaPth {
    public static void main(String[] args) {
        int rows=3;
        int col=3;
        print(1,1,rows, col,"");
    }

    private static void print(int stRow, int stCol, int endRows, int endCol,String s) {
        if (stRow>endRows||stCol>endCol)return ;
        if (stRow==endRows && stCol ==endCol){
            System.out.println(s);
            return;
        }

        //for going down
        print(stRow+1,stCol, endRows, endCol, s+"D");

        //for going  right
        print(stRow,stCol+1, endRows, endCol, s+"R");
    }
}
