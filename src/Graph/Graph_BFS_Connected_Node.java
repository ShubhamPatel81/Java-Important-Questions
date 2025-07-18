package src.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_BFS_Connected_Node {
    // this is the example of the connected node treversal

    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer>res = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> queue= new LinkedList<>();
        visited[0]=true;
        queue.offer(0);
        while (!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for (int neighbour: adj.get(node)){
                if (!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
        return res;
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

        Graph_BFS_Connected_Node graphDfs = new Graph_BFS_Connected_Node();
        ArrayList<Integer> result = graphDfs.bfsOfGraph(v, adjList);

        // Print the result
        System.out.println("BFS Traversal -> Connected Node :");
        System.out.println(result);
    }
}
