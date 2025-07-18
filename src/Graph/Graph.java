package src.Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
      class Pair{
        int node;
        int weight;
        Pair(int n, int w){
            node = n;
            weight = w;
        }

        @Override
        public String toString() {
            return "("+node+", "+ weight +")";
        }
    }
    int adjMatrix[][];
    List<List<Integer>> adjList;
    List<List<Pair>> adjListWithWeight;
    Graph(int nodes){
        adjMatrix = new int[nodes][nodes]; // java will initialize all the value as 0; -->2*2 matrix -> [0,0][0,0]
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();
        for (int i =0 ; i < nodes;i++){
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }
//   edges will be like this     --> [[0,2],[0,1],[2,0]]
    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for (int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            if (isDirected){
                // directed graph
                adjMatrix[u][v] = 1;
            }
            else {
                // undirected graph
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;

            }
        }
    }
     public void addEdgesWithWeightInMatrix(int edges[][], boolean isDirected){
        for (int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w =edge[2];

            if (isDirected){
                // directed graph
                adjMatrix[u][v] = w;
            }
            else {
                // undirected graph
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;

            }
        }
    }

    // adjacency List Graph
    public void addEdgesInList(int edges[][], boolean isDirected){
        for (int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            if (isDirected){
                // directed graph
                adjList.get(u).add(v);
            }
            else {
                // undirected graph
                adjList.get(u).add(v);
                adjList.get(v).add(u);

            }
        }
    }

    public void addEdgesInListWithWeight(int edges[][], boolean isDirected){
        for (int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];


            if (isDirected){
                // directed graph
                 Pair pair = new  Pair(v,w);// edges goes from u to v ..  u->v  and w is weight

                adjListWithWeight.get(u).add(pair);
            }
            else {
                // undirected graph
                Pair pair1 = new Pair(v,w);// edges goes from u to v ..  u->v  and w is weight
                Pair pair2 = new Pair(u,w);// edges goes from u to v ..  u->v  and w is weight
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);

            }
        }
    }

    public void findDegreeInUndirectedGraph(int edges[][], int nodes){
        int degree[] = new int[nodes];
        for (int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            degree[u]++;
            degree[v]++;
        }
        // print
        for (int i = 0; i< nodes; i++){
            System.out.println("node -> "+i +" degree -> "+degree[i]);
        }
    }

    public void findDegreeInDirectedGraph(int edges[][], int nodes){
        int inDegree[] = new int[nodes];
        int outDegree[] = new int[nodes];
        for (int edge[] : edges){
            int from = edge[0];
            int to = edge[1];
            inDegree[to]++;
            outDegree[from]++;
        }
        // print
        for (int i = 0; i< nodes; i++){
            System.out.println("node -> "+i +" Indegree -> "+inDegree[i] +" and OutDegree -> "+outDegree[i]);
        }
    }

    public void printList(){
        for (int i = 0 ; i < adjList.size(); i++){
            System.out.print(i+" -> ");
            System.out.print("[");
            for (int j =0 ; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j));
                if (j!=adjList.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void printListWithWeight(){
        for (int i = 0 ; i < adjListWithWeight.size(); i++){
            System.out.print(i+" -> ");
            System.out.print("[");
            for (int j =0 ; j<adjListWithWeight.get(i).size(); j++){
                System.out.print(adjListWithWeight.get(i).get(j));
                if (j!=adjList.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void printMatrix(){
        for (int i = 0 ; i<adjMatrix.length; i++){
            System.out.print("Rows "+i +"->");
            for (int j = 0 ; j < adjMatrix[i].length; j++){
                System.out.print(adjMatrix[i][j]+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int edges [][] = {{0,2},{0,1},{1,3}};
//        int nodes =4;
//
//        System.out.println("Undirected Graph Adjacency Matrix ===============================");
//        Graph  graph = new Graph(4);
//        graph.addEdgesInMatrix(edges,false);
//        System.out.println();
//        graph.printMatrix();
//
//        System.out.println("Directed Graph Adjacency Matrix================================");
//
//        Graph directedGraph = new Graph(4);
//        directedGraph.addEdgesInMatrix(edges, true);
//        directedGraph.printMatrix();
//
//        System.out.println("Waited Graph  Adjacency Matrix =====================================");
//        int edgesW[][]= {{0,2,10},{0,1,20},{1,3,30}};
//        int nodesW = 4;
//        System.out.println("Waited Undirected Graph --> ");
//        graph.addEdgesWithWeightInMatrix(edgesW,false);
//        graph.printMatrix();
//        System.out.println("Waited Directed Graph  -->");
//        directedGraph.addEdgesWithWeightInMatrix(edgesW,true);
//        directedGraph.printMatrix();

//        int edges [][] = {{0,2},{0,1},{1,3}};
//        int nodes =4;
//        System.out.println("Undirected Graph  Adjacency List ===============================");
//        Graph  graph = new Graph(4);
//        graph.addEdgesInList(edges,false);
//        System.out.println();
//        graph.printList();
//
//        System.out.println("Directed Graph Adjacency List================================");
//
//        Graph directedGraph = new Graph(4);
//        directedGraph.addEdgesInList(edges, true);
//        directedGraph.printList();


        System.out.println("Waited Graph  Adjacency List =====================================");
        int edgesW[][]= {{0,2,10},{0,1,20},{1,3,30}};
        int nodesW = 4;
//        Graph graph = new Graph(nodesW);
//        System.out.println("Waited Undirected List Graph --> ");
//        graph.addEdgesInListWithWeight(edgesW,false);
//        graph.printListWithWeight();
//
//        System.out.println("Waited Directed List Graph  -->");
//        Graph directedGraph = new Graph(4);
//        directedGraph.addEdgesInListWithWeight(edgesW,true);
//        directedGraph.printListWithWeight();


        System.out.println("Find the degree of the undirected Graph===========================");
        Graph graph = new Graph(nodesW);
        graph.findDegreeInUndirectedGraph(edgesW,4);

        System.out.println("Find the degree of the Directed Graph===========================");
        Graph graphd = new Graph(nodesW);
        graphd.findDegreeInDirectedGraph(edgesW,4);


    }
}
