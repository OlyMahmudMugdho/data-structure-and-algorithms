import java.util.List;
import java.util.Stack;

public class HasPathStack {
    public static boolean hasPathStack(Graph graph, char source, char destination) {
        Stack<Character> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()) {
            char current = stack.pop();
            List<Character> neighbours = graph.adjacencyList.get(current);
            for (char neighbour : neighbours) {
                if(neighbour == destination) {
                    return true;
                }
                stack.push(neighbour);
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
        System.out.println(hasPathStack(graph,'f','k'));
    }
}
