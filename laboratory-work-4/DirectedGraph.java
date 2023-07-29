import java.util.*;

class DirectedGraph {
    private Map<Integer, List<Integer>> adjList;

    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.get(source).add(destination);
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }
}

