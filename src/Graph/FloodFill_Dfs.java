package src.Graph;

import java.util.Arrays;

class FloodFill_Dfs {
    int rows;
    int cols;

    void dfs(int row, int col, int newColor, int currColor, boolean[][] visited, int[][] image) {
        // Correct boundary and condition check
        if (row < 0 || row >= rows || col < 0 || col >= cols || image[row][col] != currColor || visited[row][col])
            return;

        image[row][col] = newColor;
        visited[row][col] = true;

        int[][] adjList = {
                {row - 1, col}, // up
                {row, col + 1}, // right
                {row + 1, col}, // down
                {row, col - 1}  // left
        };

        for (int[] neighbour : adjList) {
            dfs(neighbour[0], neighbour[1], newColor, currColor, visited, image);
        }
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

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;

        if (image[sr][sc] == color) return image; // optimization to avoid infinite recursion

        boolean[][] visited = new boolean[rows][cols];
        dfs(sr, sc, color, image[sr][sc], visited, image);
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        FloodFill_BFS floodFillBfs = new FloodFill_BFS();
        int[][] res = floodFillBfs.floodFill(image, sr, sc, color);
//       for (int i = 0 ; i < res.length; i++){
//           for (int j = 0 ; j < res[0].length; j++){
//               System.out.print(res[i][j] +" ");
//           }
//       }
        System.out.println("Flood Fill Printing Using DFS : ");
        System.out.println(Arrays.deepToString(res));
        print2DArray(res);
    }
}
