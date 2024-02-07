import java.util.*;

public class Graph {
    Map<Character, List<Character>> adjacencyList = new HashMap<>();

    public void addVertex(char key) {
        this.adjacencyList.put(key, new ArrayList<>());
    }

    public void addEdge(char key, char value) {
        if(this.adjacencyList.get(key) != null) {
            this.adjacencyList.get(key).add(value);
        }

        else {
            this.adjacencyList.put(key, new ArrayList<>());
            this.adjacencyList.get(key).add(value);
        }
    }

    public List<Character> getValues(char key) {
        return this.adjacencyList.get(key);
    }

    public void DFS(){
        Stack<Character> stack = new Stack<>();
        stack.push(this.adjacencyList.keySet().iterator().next());
        while (!stack.isEmpty()) {
            Character current = stack.pop();
            System.out.println(current);
            List<Character> neighbours = this.adjacencyList.get(current);

            if(neighbours != null) {
                for (Character item : neighbours) {
                    stack.push(item);
                }
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

        // a c e b d f (output of DFS )

    }
}