package org.astanait.edu.kz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Vertex<V>>> map;

    public WeightedGraph() {
        this.map = new HashMap<>();
    }

    public void addVertex(Vertex<V> vertex) {
        map.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        if (!map.containsKey(source) || !map.containsKey(destination)) {
            throw new IllegalArgumentException("Both source and destination vertices should exist in the graph.");
        }
        source.addAdjacent(destination, weight);
        map.get(source).add(destination);
    }

    public List<Vertex<V>> getAdjacentVertices(Vertex<V> vertex) {
        return map.getOrDefault(vertex, new ArrayList<>());
    }

    public Map<Vertex<V>, List<Vertex<V>>> getGraphMap() {
        return map;
    }
}