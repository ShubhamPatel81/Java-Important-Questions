package src.BackTracking;

public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows=3;
        int col=3;
        boolean [][] isVisited= new boolean[rows][col];//by default -> false;
        print(0,0,rows-1, col-1,"",isVisited);
    }

    private static void print(int stRow, int stCol, int endRows, int endCol,String s,boolean[][] isVisited) {
        if (stRow<0|| stCol<0) return;
        if (stRow>endRows||stCol>endCol)return ;
        if (isVisited[stRow][stCol]==true) return;
        if (stRow==endRows && stCol ==endCol){
            System.out.println(s);
            return;
        }
        isVisited[stRow][stCol]=true;
        //for going down
        print(stRow+1,stCol, endRows, endCol, s+"D",isVisited);

        //for going  right
        print(stRow,stCol+1, endRows, endCol, s+"R",isVisited);

        //go left
        print(stRow,stCol-1, endRows, endCol, s+"L",isVisited);

        //go up
        print(stRow-1,stCol, endRows, endCol, s+"U",isVisited);

        //backtracking
        isVisited[stRow][stCol]=false;
    }

}
