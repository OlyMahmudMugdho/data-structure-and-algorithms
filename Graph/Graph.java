import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    static void initGraph(ArrayList<Edge> graph[]) {
        for (int i=0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    }

    static void BFS(ArrayList<Edge> graph[], boolean[] visited, int vertices,int start){

        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<vertices; i++){
            visited[i] = false;
        }

        queue.add(start);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                for (int i=0; i<graph[curr].size(); i++){
                    visited[curr] = true;
                    Edge e = graph[curr].get(i);
                    queue.add(e.destination);
                }
            }
        }
    }

    static void DFS(ArrayList<Edge> graph[], boolean visited[], int start){
        System.out.print(start + " ");
        visited[start] = true;

        for (int i=0; i<graph[start].size(); i++){
            if (!visited[graph[start].get(i).destination]){
                DFS(graph,visited,graph[start].get(i).destination);
            }
        }


    }

    public static void main(String[] args) {
        int vertices = 7;

        ArrayList<Edge> graph[] = new ArrayList[vertices];

        initGraph(graph);
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

        // printing the graph
        for (int i=0; i<vertices; i++){
            for (int j=0; j<graph[i].size(); j++){
                System.out.print("[" +graph[i].get(j).source + "," + graph[i].get(j).destination + "]");
                if((i==(vertices-1) && (j==(graph[i].size())-1))) {
                    continue;
                }
                System.out.print(" , ");
            }
        }

        System.out.println();

        // performing BFS
        boolean[] visited = new boolean[vertices];
        for (int i=0; i<vertices; i++){
            if (!visited[i]){
                BFS(graph,visited, 7,i);
            }
        }

        System.out.println();

        for (int i=0; i<vertices; i++){
            visited[i] = false;
        }

        for (int i=0; i<vertices; i++){
            if (!visited[i]){
                DFS(graph,visited,i);
            }
        }
    }
}

