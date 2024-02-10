import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HasPathQueue {
    public static boolean hasPathQueue(Graph graph, char source, char destination) {
        Queue<Character> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()){
            char current = queue.remove();
            List<Character> neighbours = graph.adjacencyList.get(current);
            for (char neighbour : neighbours) {
                if (neighbour == destination){
                    return true;
                }
                queue.add(neighbour);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('f','g');
        graph.addEdge('f','i');
        graph.addEdge('g','h');
        graph.addVertex('h');
        graph.addEdge('i','g');
        graph.addEdge('i','k');
        graph.addEdge('j','i');
        graph.addVertex('k');
        System.out.println(hasPathQueue(graph,'f','j'));
    }
}
