public class Main {
    public static void main(String[] args) {
                DirectedGraph graph = new DirectedGraph();
                graph.addEdge(1, 2);
                graph.addEdge(1, 3);
                graph.addEdge(2, 3);
                graph.addEdge(3, 4);

                System.out.println("Adjacent vertices of 1: " + graph.getAdjacentVertices(1));
                System.out.println("Adjacent vertices of 3: " + graph.getAdjacentVertices(3));
            }
        }