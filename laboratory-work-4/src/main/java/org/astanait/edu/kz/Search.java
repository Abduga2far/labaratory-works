package org.astanait.edu.kz;

import java.util.*;

public abstract class Search<V> {
    protected WeightedGraph<V> graph;

    public Search(WeightedGraph<V> graph) {
        this.graph = graph;
    }

    public abstract boolean hasPath(Vertex<V> source, Vertex<V> destination);

    public abstract List<Vertex<V>> getPath(Vertex<V> source, Vertex<V> destination);

    protected List<Vertex<V>> reconstructPath(Map<Vertex<V>, Vertex<V>> cameFrom, Vertex<V> source, Vertex<V> destination) {
        LinkedList<Vertex<V>> path = new LinkedList<>();
        Vertex<V> current = destination;
        while (!current.equals(source)) {
            path.addFirst(current);
            current = cameFrom.get(current);
        }
        path.addFirst(source);
        return path;
    }
}