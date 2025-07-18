package src.BackTracking;

public class RatInADeadMazeOR_3_Maze {
    public static void main(String[] args) {
        int rows=4;
        int col=6;

        int maze[][]={{1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}};
        print(0,0,rows-1, col-1,"",maze);
    }
    private static void print(int stRow, int stCol, int endRows, int endCol,String s,int [][]maze) {
        if (stRow>endRows||stCol>endCol)return ;
        if (stRow==endRows && stCol ==endCol){
            System.out.println(s);
            return;
        }
        if (maze[stRow][stCol]==0)return;

        //for going down
        print(stRow+1,stCol, endRows, endCol, s+"D",maze);
        //for going  right
        print(stRow,stCol+1, endRows, endCol, s+"R",maze);
    }
}
