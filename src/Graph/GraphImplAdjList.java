package src.Graph;

import java.util.ArrayList;

public class GraphImplAdjList {

    static class Edges{
        int src;
        int dest;
        int weight;
        public  Edges(int s, int d,int w){
            this.src =s;
            this.dest =d;
            this.weight=w;
        }

    }
    public static void createGraph(ArrayList<Edges> graph[]){
            for (int i = 0 ;i< graph.length;i++){
                graph[i] = new ArrayList<Edges>();
            }
            graph[0].add(new Edges(0,2,2));
            graph[1].add(new Edges(1,2,10));
            graph[1].add(new Edges(1,3,0));
            graph[2].add(new Edges(2,0,2));
            graph[2].add(new Edges(2,1,10));
            graph[2].add(new Edges(2,3,-1));
            graph[3].add(new Edges(3,2,-1));
            graph[3].add(new Edges(3,1,0));
    }

    public static void main(String[] args) {
            int v = 4;

        ArrayList<Edges> graph[] = new ArrayList[v];
        createGraph(graph);
        // print 2's neighbour
        for (int i = 0; i < graph[2].size();i++){
            Edges e = graph[2].get(i);
            System.out.println(e.src +"-> "+ e.dest+" , "+e.weight);
        }

    }
}
