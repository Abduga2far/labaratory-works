package org.astanait.edu.kz;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>(true);
        Vertex<String> AITU = new Vertex<>("AITU");
        Vertex<String> MUIT = new Vertex<>("MUIT");
        Vertex<String> SDU = new Vertex<>("SDU");
        Vertex<String> KBTU = new Vertex<>("KBTU");
        Vertex<String> Narxoz = new Vertex<>("Narxoz");
        graph.addEdge(AITU, MUIT, 2.1);
        graph.addEdge(AITU, SDU, 7.2);
        graph.addEdge(SDU, MUIT, 3.9);
        graph.addEdge(MUIT, KBTU, 3.5);
        graph.addEdge(SDU, Narxoz, 5.4);

        System.out.println("Dijkstra:");
        Search<String> djk = new DijkstraSearch<String>(graph, AITU);
        outputPath(djk, Narxoz);

        System.out.println("\n--------------------------------");

        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<String>(graph, AITU);
        outputPath(bfs, Narxoz);
    }

    public static void outputPath(Search<String> search, Vertex<String> key) {
        for (Vertex<String> v : search.pathTo(key)) {
            System.out.print(v.getData() + " -> ");
        }
    }
}
