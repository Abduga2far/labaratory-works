package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];

        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the minimum element in the array
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Print the minimum element
        System.out.println("The minimum element is: " + min);
    }
}