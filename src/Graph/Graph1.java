package src.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Graph Using hash Map
public class Graph1<T> {
    private Map<T, List<T>> adjList;

    public Graph1(){
        adjList = new HashMap<>();
    }
    public void  addVertex(T vertex){
        adjList.putIfAbsent(vertex,new ArrayList<>());
    }
    public void addEdgeInDirectedGraph(T source, T destination){
        adjList.putIfAbsent(source,new ArrayList<>());
        adjList.putIfAbsent(destination,new ArrayList<>());
        adjList.get(source).add(destination);
    }
    public void addEdgeInUndirectedGraph(T source, T destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        // For an undirected graph, add the reverse edge as well:
         adjList.get(destination).add(source);
    }
    public List<T> getNeighboures(T vertex){
        return adjList.getOrDefault(vertex,new ArrayList<>());
    }
    public void printGraph(){
        for (T vertex: adjList.keySet()){
            System.out.println(vertex + " -> ");
            for (T neighbour: adjList.get(vertex)){
                System.out.println(neighbour+" ");
            }
            System.out.println();
        }
    }
}
