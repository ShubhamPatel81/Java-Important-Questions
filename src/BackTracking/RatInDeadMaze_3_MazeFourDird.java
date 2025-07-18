package src.BackTracking;

public class RatInDeadMaze_3_MazeFourDird{
    public static void main(String[] args) {
        int rows=3;
        int col=4;

        int maze[][]={{1,0,1,1},
                {1,1,1,1,},
                {0,1,1,1}};
        boolean[][] isVisited = new boolean[rows][col];
        print(0,0,rows-1, col-1,"",maze, isVisited);

    }
    private static void print(int stRow, int stCol, int endRows, int endCol,String s,int [][]maze, boolean[][] isVisited) {
       if (stRow<0|| stCol<0)return;
        if (stRow>endRows||stCol>endCol)return ;
        if (stRow==endRows && stCol ==endCol){
            System.out.println(s);
            return;
        }
        if (maze[stRow][stCol]==0)return;
        if (isVisited[stRow][stCol]==true) return;
        //check
        isVisited[stRow][stCol]=true;

        //for going down
        print(stRow+1,stCol, endRows, endCol, s+"D",maze,isVisited);
        //for going  right
        print(stRow,stCol+1, endRows, endCol, s+"R",maze,isVisited);
        //for left
        print(stRow,stCol-1, endRows, endCol, s+"L",maze,isVisited);
        //for up
        print(stRow-1,stCol, endRows, endCol, s+"U",maze,isVisited);


        //backtracking
        isVisited[stRow][stCol] = false;
    }
}
