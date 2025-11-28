package src.Graph;

import java.util.*;

class UndirectedGraph {
    private Map<Integer, List<Integer>> adjList;

    public UndirectedGraph() {
        adjList = new HashMap<>();
    }

    // Adds a vertex to the graph
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Adds an undirected edge between two vertices
    public void addEdge(int u, int v) {
        addVertex(u); // Ensure vertices exist
        addVertex(v);
        adjList.get(u).add(v);
        adjList.get(v).add(u); // For undirected graph, add edge in both directions
    }

    // Prints the adjacency list
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + " is connected to: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}