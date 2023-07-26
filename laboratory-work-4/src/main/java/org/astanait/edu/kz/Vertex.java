package org.astanait.edu.kz;

import java.util.HashMap;
import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices; // with weights

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public void addAdjacent(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public V getData() {
        return data;
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }
}