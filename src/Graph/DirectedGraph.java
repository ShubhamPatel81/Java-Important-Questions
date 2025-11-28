package src.Graph;
import java.util.*;

class DirectedGraph {
    private Map<Integer, List<Integer>> adjList;

    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    // Adds a vertex to the graph
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Adds a directed edge from source to destination
    public void addEdge(int source, int destination) {
        addVertex(source); // Ensure vertices exist
        addVertex(destination);
        adjList.get(source).add(destination); // Only add edge from source to destination
    }

    // Prints the adjacency list
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + " points to: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}