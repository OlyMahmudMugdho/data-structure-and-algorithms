import java.util.*;

public class TopologicalSort {
    public static int getInOrder(Graph graph, char vertex) {
        int order = 0;
        List<Character> keys = graph.adjacencyList.keySet().stream().toList();
        for (char key : keys) {
            if (graph.adjacencyList.get(key).contains(vertex)){
                order++;
            }
        }
        return order;
    }

    public static Map<Character,Integer> inOrders(Graph graph) {
        Map<Character,Integer> orders = new HashMap<>();
        int count = 0;
        Set<Character> keySet = graph.adjacencyList.keySet();
        Set<Character> set = new TreeSet<>();

        set.addAll(keySet);

        for (char item : keySet) {
            set.addAll(graph.adjacencyList.get(item));
        }

        for (char item : set) {
            orders.put(item,getInOrder(graph,item));
        }
        return orders;
    }
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('A','B');
        graph.addEdge('A','D');
        graph.addEdge('B','C');

        System.out.println(inOrders(graph).toString());
    }
}
