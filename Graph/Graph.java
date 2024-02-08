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
        graph.addEdge('a','c');
        graph.addEdge('a','b');
        graph.addEdge('b','d');
        graph.addEdge('c','e');
        graph.addEdge('d','f');
        graph.addVertex('e');
        graph.addVertex('f');

        // graph.DFS();
        recursiveDFS(graph,'a');
        System.out.println(hasPath(graph,'a','e'));
        System.out.println(hasPathBFS(graph,'a','e'));
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


    public static boolean hasPath(Graph graph,char source, char destination) {
        if (source == destination) {
            return true;
        }
            List<Character> values = graph.adjacencyList.get(source);
            for (Character value : values) {
                if (hasPath(graph, value, destination)) {
                    return true;
                }
            }
        return false;
    }

    public static boolean hasPathBFS(Graph graph, char source, char destination){

        if (source == destination) {
            return true;
        }

        Queue<Character> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            Character current = queue.remove();
            List<Character> values = graph.adjacencyList.get(current);
            if (values != null) {
                for (Character value : values) {
                    if (hasPathBFS(graph, value, destination)) {
                        return true;
                    }

                }
            }
        }
        return false;
    }

    public static void recursiveDFS(Graph graph, char source) {
        System.out.print(source + " ");
        List<Character> values = graph.adjacencyList.get(source);
        for (Character value : values) {
            recursiveDFS(graph,value);
        }
    }

}