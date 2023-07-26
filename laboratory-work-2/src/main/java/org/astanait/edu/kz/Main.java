package org.astanait.edu.kz;

import org.astanait.edu.kz.Interface.MyList;

public class Main {
    public static void main(String[] args) {
        // Test MyArrayList
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("grape");
        arrayList.add("mango");

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList contains 'orange': " + arrayList.contains("orange"));
        System.out.println("ArrayList contains 'kiwi': " + arrayList.contains("kiwi"));
        System.out.println("ArrayList index of 'banana': " + arrayList.indexOf("banana"));
        System.out.println("ArrayList last index of 'apple': " + arrayList.lastIndexOf("apple"));

        System.out.println("ArrayList elements: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        arrayList.sort();

        System.out.println("Sorted ArrayList elements:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        arrayList.remove(1); // Remove element at index 1
        System.out.println("MyArrayList after removing element at index 1: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // Test MyLinkedList
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(20);
        linkedList.add(50);

        System.out.println("\nLinkedList size: " + linkedList.size());
        System.out.println("LinkedList contains 30: " + linkedList.contains(30));
        System.out.println("LinkedList contains 60: " + linkedList.contains(60));
        System.out.println("LinkedList index of 20: " + linkedList.indexOf(20));
        System.out.println("LinkedList last index of 40: " + linkedList.lastIndexOf(40));

        System.out.println("LinkedList elements:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        linkedList.sort();

        System.out.println("Sorted LinkedList elements:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        linkedList.remove(Integer.valueOf("40")); // Remove 40
        System.out.println("MyLinkedList after removing 'banana': ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
    }
}
