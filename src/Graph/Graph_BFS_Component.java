package src.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_BFS_Component {
    // This is the example of the non-connected node (int which different component of graph are there and we need to treverse)
    public ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0 ; i< v; i++){
            if (!visited[i]){
                bfs(i,queue,visited,res,adj);
            }
        }

        return res;
    }

    private void bfs(int source, Queue<Integer> queue, boolean[] visited, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> adj) {

        visited[source] = true;
            queue.offer(source);
            while (!queue.isEmpty()){
                int node = queue.poll();
                res.add(node);
                for(int neighbour : adj.get(node)){
                    if (!visited[neighbour]){
                        visited[neighbour] = true;
                        queue.offer(neighbour);
                    }
                }
            }
    }

    public static void main(String[] args) {
        int v = 5;
        int[][] adjMatrix = {
                {2, 3, 1},
                {0},
                {0, 4},
                {0},
                {2}
        };

        // Convert to ArrayList<ArrayList<Integer>> format
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            ArrayList<Integer> neighbors = new ArrayList<>();
            for (int val : adjMatrix[i]) {
                neighbors.add(val);
            }
            adjList.add(neighbors);
        }

        Graph_BFS_Component graphDfs = new Graph_BFS_Component();
        ArrayList<Integer> result = graphDfs.bfsGraph(v, adjList);

        // Print the result
        System.out.println("BFS Traversal -> Non-Connected Node :");
        System.out.println(result);
    }
}
