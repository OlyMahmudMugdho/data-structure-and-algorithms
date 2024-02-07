import java.util.*;
public class Graph {
    Map<Character, List<Character>> adjacencyList = new HashMap<>();

    public void addVertex(char key) {
        adjacencyList.put(key, new ArrayList<>());
    }

    public void addEdge(char key, char value) {
        if(adjacencyList.get(key) != null) {
            adjacencyList.get(key).add(value);
        }

        else {
            adjacencyList.put(key, new ArrayList<>());
            adjacencyList.get(key).add(value);
        }
    }

    public List<Character> getValues(char key) {
        return adjacencyList.get(key);
    }

    public void DFS(){
        Stack<Character> stack = new Stack<>();
        stack.push(adjacencyList.keySet().iterator().next());
        while (!stack.isEmpty()) {
            Character current = stack.pop();
            System.out.println(current);
            List<Character> neighbours = adjacencyList.get(current);

            if(neighbours != null) {
                stack.addAll(neighbours);
//                for (Character item : neighbours) {
//                    stack.push(item);
//                }
            }
        }
    }



    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('a','b');
        graph.addEdge('a','c');
        graph.addEdge('b','d');
        graph.addEdge('c','e');
        graph.addEdge('d','f');
        graph.addVertex('e');
        graph.addVertex('f');

        graph.DFS();
        // BFS(graph);
        // a c e b d f (output of DFS )
        // a c b e d f

    }

    public static void BFS(Graph graph) {
        Queue<Character> queue = new LinkedList<>();
        queue.add(graph.adjacencyList.keySet().iterator().next());
        while (!queue.isEmpty()){
            Character current = queue.remove();
            System.out.println(current);
            List<Character> values = graph.adjacencyList.get(current);
            if (values != null) {
                queue.addAll(values);
//                for (Character val : values) {
//                    queue.add(val);
//                }
            }
        }
    }
}