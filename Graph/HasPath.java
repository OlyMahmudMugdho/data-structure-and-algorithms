import java.util.List;

public class HasPath {
    public static boolean hasPathRecursive(Graph graph, char source, char destination) {
        if(source == destination) {
            return true;
        }
        List<Character> neighbours = graph.adjacencyList.get(source);
        for (char neighbour : neighbours) {
            if(hasPathRecursive(graph, neighbour, destination)) {
                return true;
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
        System.out.println(hasPathRecursive(graph,'f','h'));
    }

}
