package src.Graph;

public class Graph1Test {
    public static void main(String[] args) {
        // Create a new graph of type String
        Graph1<String> graph = new Graph1<>();

        // Test 1: Add vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        // Test 2: Add undirected edges
        graph.addEdgeInUndirectedGraph("A", "B");
        graph.addEdgeInUndirectedGraph("A", "C");
        graph.addEdgeInUndirectedGraph("B", "D");

        // Test 3: Print the graph
        System.out.println("Undirected Graph:");
        graph.printGraph();

        // Test 4: Get neighbors
        System.out.println("\nNeighbours of A: " + graph.getNeighboures("A"));
        System.out.println("Neighbours of B: " + graph.getNeighboures("B"));
        System.out.println("Neighbours of D: " + graph.getNeighboures("D"));

        // Test 5: Directed Graph Example
        Graph1<String> directedGraph = new Graph1<>();
        directedGraph.addEdgeInDirectedGraph("1", "2");
        directedGraph.addEdgeInDirectedGraph("1", "3");
        directedGraph.addEdgeInDirectedGraph("2", "4");

        System.out.println("\nDirected Graph:");
        directedGraph.printGraph();

        System.out.println("\nNeighbours of 1: " + directedGraph.getNeighboures("1"));
        System.out.println("Neighbours of 2: " + directedGraph.getNeighboures("2"));
        System.out.println("Neighbours of 3: " + directedGraph.getNeighboures("3"));
    }
}