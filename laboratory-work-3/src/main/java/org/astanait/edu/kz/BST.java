package org.astanait.edu.kz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BST<K extends Comparable<K>, V> implements Iterable<BST.Element<K, V>> {
    private Node root;
    private int size;

    private class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public void put(K key, V val) {
        root = put(root, key, val);
    }

    private Node put(Node node, K key, V val) {
        if (node == null) {
            size++;
            return new Node(key, val);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, val);
        } else if (cmp > 0) {
            node.right = put(node.right, key, val);
        } else {
            node.val = val;
        }

        return node;
    }

    public V get(K key) {
        return get(root, key);
    }

    private V get(Node node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node.val;
        }
    }

    public void delete(K key) {
        root = delete(root, key);
    }

    private Node delete(Node node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null) {
                size--;
                return node.right;
            } else if (node.right == null) {
                size--;
                return node.left;
            }

            Node minRight = findMin(node.right);
            node.key = minRight.key;
            node.val = minRight.val;
            node.right = delete(node.right, minRight.key);
        }

        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Element<K, V>> iterator() {
        return new InOrderIterator();
    }

    private class InOrderIterator implements Iterator<BST.Element<K, V>> {
        private List<BST.Element<K, V>> elements;
        private int currentIndex;

        public InOrderIterator() {
            elements = new ArrayList<>();
            inOrderTraversal(root);
            currentIndex = 0;
        }

        private void inOrderTraversal(Node node) {
            if (node == null) {
                return;
            }

            inOrderTraversal(node.left);
            elements.add(new Element<>(node.key, node.val));
            inOrderTraversal(node.right);
        }

        @Override
        public boolean hasNext() {
            return currentIndex < elements.size();
        }

        @Override
        public BST.Element<K, V> next() {
            if (hasNext()) {
                return elements.get(currentIndex++);
            }
            throw new NoSuchElementException("No more elements to iterate.");
        }
    }

    public static class Element<K, V> {
        public K key;
        public V val;

        public Element(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }
}