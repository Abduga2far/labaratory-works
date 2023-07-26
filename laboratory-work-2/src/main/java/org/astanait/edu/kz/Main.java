package org.astanait.edu.kz;

import org.astanait.edu.kz.Interface.MyList;

public class Main {
    public static void main(String[] args) {
        // Test MyArrayList
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Kiwi");

        System.out.println("MyArrayList:");
        System.out.println("Size: " + arrayList.size());
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        System.out.println("Contains 'Watermelon': " + arrayList.contains("Watermelon"));
        System.out.println("Index of 'Orange': " + arrayList.indexOf("Orange"));
        System.out.println("Last index of 'Banana': " + arrayList.lastIndexOf("Banana"));
        System.out.println("Element at index 2: " + arrayList.get(2));

        arrayList.remove("Grapes");
        System.out.println("After removing 'Grapes':");
        System.out.println("Size: " + arrayList.size());
        System.out.println("Contains 'Grapes': " + arrayList.contains("Grapes"));

        arrayList.add("Mango", 1);
        System.out.println("After adding 'Mango' at index 1:");
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));

        arrayList.sort();
        System.out.println("After sorting:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + arrayList.get(i));
        }

        arrayList.clear();
        System.out.println("After clearing:");
        System.out.println("Size: " + arrayList.size());

        // Test MyLinkedList
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println("\nMyLinkedList:");
        System.out.println("Size: " + linkedList.size());
        System.out.println("Contains 30: " + linkedList.contains(30));
        System.out.println("Contains 60: " + linkedList.contains(60));
        System.out.println("Index of 20: " + linkedList.indexOf(20));
        System.out.println("Last index of 40: " + linkedList.lastIndexOf(40));
        System.out.println("Element at index 2: " + linkedList.get(2));

        linkedList.remove(3);
        System.out.println("After removing element at index 3:");
        System.out.println("Size: " + linkedList.size());
        System.out.println("Contains 40: " + linkedList.contains(40));

        linkedList.add(25, 1);
        System.out.println("After adding 25 at index 1:");
        System.out.println("Size: " + linkedList.size());
        System.out.println("Element at index 1: " + linkedList.get(1));

        linkedList.sort();
        System.out.println("After sorting:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at index " + i + ": " + linkedList.get(i));
        }

        linkedList.clear();
        System.out.println("After clearing:");
        System.out.println("Size: " + linkedList.size());
    }
}

