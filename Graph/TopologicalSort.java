import java.util.List;

public class TopologicalSort {
    public static int inOrder(Graph graph, char vertex) {
        int order = 0;
        List<Character> keys = graph.adjacencyList.keySet().stream().toList();
        for (char key : keys) {
            if (graph.adjacencyList.get(key).contains(vertex)){
                order++;
            }
        }
        return order;
    }
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('A','B');
        graph.addEdge('A','D');
        graph.addEdge('E','B');
        graph.addEdge('B','C');

        System.out.println(inOrder(graph,'B'));
    }
}
