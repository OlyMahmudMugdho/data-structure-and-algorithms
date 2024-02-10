public class BuildGraph {
    public static void buildGraph(Graph graph, char[][] edges) {
        for (char[] item : edges) {
            graph.addEdge(item[0],item[1]);
            graph.addEdge(item[1],item[0]);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        char[][] edges = {
                {'i','j'},
                {'k','i'},
                {'m','k'},
                {'k','l'},
                {'o','n'}
        };

        buildGraph(graph,edges);

        System.out.println(graph.adjacencyList.get('n'));

    }
}
