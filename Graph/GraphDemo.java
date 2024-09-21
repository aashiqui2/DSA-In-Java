import java.util.ArrayList;

public class GraphDemo {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        //? making the rid of null pointer exception by malking the list empty instead of null
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int V = 4;

        // int a[]=new int[4];
        ArrayList<Edge> graph[] = new ArrayList[V];
        // System.out.println(graph[0]);//null by default

        // ! when it is null we cannot store any value in the place of null
        // graph[0].add(new Edge(1, 2));
        // System.out.println(graph[0]);
        /*
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
         * "java.util.ArrayList.add(Object)" because "<local2>[0]" is null
         * at GraphDemo.main(GraphDemo.java:21)
         */

        createGraph(graph);

        //? print 0's neighbours
        for(int i=0;i<graph[0].size();i++)
        {
           Edge e=graph[0].get(i);
           System.out.print(e.dest+" ");
        }

    }
}