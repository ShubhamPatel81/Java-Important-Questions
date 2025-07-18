package src.Graph;

import java.util.ArrayList;

public class Graph_DFS {

    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[v];
        // Start DFS from node 0 as per common convention
        dfs(0, visited, adj, res);
        return res;
    }

    private void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, adj, res);
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

        Graph_DFS graphDfs = new Graph_DFS();
        ArrayList<Integer> result = graphDfs.dfsOfGraph(v, adjList);

        // Print the result
        System.out.println("DFS Traversal:");
        System.out.println(result);
    }
}
