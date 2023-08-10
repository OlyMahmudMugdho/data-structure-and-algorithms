import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
//    int vertices;
//    boolean[] visited = new boolean[vertices];



//    public void initBFS (int vertices) {
////        this.vertices = vertices;
//
//
//    }
    BFS(ArrayList<Edge> graph[], int vertices){
        Queue<Integer> nodeQueue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        for (int i=0; i<vertices; i++){
            visited[i] = false;
        }
//        initBFS(vertices);
        nodeQueue.add(0);

        while (!nodeQueue.isEmpty()){
            int currentNode = nodeQueue.remove();
            if (visited[currentNode] == false) {
                System.out.print(currentNode + " ");
                visited[currentNode] = true;
                for (int i=0; i<graph[currentNode].size(); i++){
                    Edge e = graph[currentNode].get(i);
                    nodeQueue.add(e.destination);
                }
            }
        }
    }


    BFS(ArrayList<Edge> graph[], int vertices, int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> nodeQueue = new LinkedList<>();

        for (int i=0; i<vertices; i++){
            visited[i] = false;
        }
//        initBFS(vertices);

        nodeQueue.add(start);


        while (!nodeQueue.isEmpty()){
            int currentNode = nodeQueue.remove();
            if (visited[currentNode] == false) {
                System.out.print(currentNode + " ");

                for (int i=0; i<graph[currentNode].size(); i++){
                    visited[currentNode] = true;
                    Edge e = graph[currentNode].get(i);
                    nodeQueue.add(e.destination);
                }
            }
        }
    }

}