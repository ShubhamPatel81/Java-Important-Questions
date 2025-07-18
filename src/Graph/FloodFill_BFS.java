package src.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill_BFS {
    int rows;
    int cols;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;
        int currColor = image[sr][sc];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        image[sr][sc] =color; //fill //visit
        while (!queue.isEmpty()){
            int node[] = queue.poll();
            int row =node[0];
            int col = node[1];
            int adjList[][] = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
            for (int neightbour[] : adjList){
                int r = neightbour[0];
                int c = neightbour[1];
                if (r < 0 || r >= rows || c < 0 || c >= cols || image[r][c] != currColor || image[r][c]==color)
                    continue;
                queue.offer(new  int[]{r,c});
                image[r][c] = color;
            }
        }
        return image;
    }
    public static void print2DArray(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
       int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        FloodFill_BFS floodFillBfs = new FloodFill_BFS();
       int [][] res =  floodFillBfs.floodFill(image, sr,sc,color);
//       for (int i = 0 ; i < res.length; i++){
//           for (int j = 0 ; j < res[0].length; j++){
//               System.out.print(res[i][j] +" ");
//           }
//       }
        System.out.println("Flood Fill Printing Using BFS : ");
        System.out.println(Arrays.deepToString(res));
        print2DArray(res);
    }

}
