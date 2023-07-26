package org.astanait.edu.kz;

public class Main {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();
        tree.put(1, "One");
        tree.put(2, "Two");
        tree.put(3, "Three");
        tree.put(4, "Four");

        for (BST.Element elem : tree) {
            System.out.println("Key is " + elem.key + " and value is " + elem.val);
        }
    }
}