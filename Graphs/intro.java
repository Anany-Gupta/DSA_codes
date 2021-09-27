

import java.util.*;
public class intro {
    public static class Edge {
        int src, nbr, wt;
        
        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest){
        boolean[] visited = new boolean[graph.length];
        return hasPathHelper(graph,src,visited,dest);
        
    }
    public static boolean hasPathHelper(ArrayList<Edge>[] graph,int vtx,boolean[] visited,int dest){
        if(vtx==dest) return true;
        visited[vtx]=true;
        for(Edge e : graph[vtx]){
            if(visited[e.nbr]==false){
                boolean res = hasPathHelper(graph,e.nbr,visited,dest);
                if(res) return true;
            }
        }
        return false;
    }
    public static void display(ArrayList<Edge>[] graph) {
        int vtces = graph.length;
        for (int i = 0; i < vtces; i++) {
            ArrayList<Edge> list = graph[i];
            System.out.print(i + " -> ");
            for (Edge e : list) {
                System.out.print(e.nbr + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vtcs = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vtcs];
        for (int i = 0; i < vtcs; i++) {
            graph[i] = new ArrayList<Edge>();// optional Edge to create clarity
        }
        for (int i = 0; i < edges; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt = sc.nextInt();
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        //Display
        // display(graph);
        //hasPath 
        int src = sc.nextInt();
        int dest = sc.nextInt();
        System.out.println(hasPath(graph,src,dest));
        sc.close();
    }

}
