package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_7 {
    public static void printReverse(int[] array, int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(array[n - 1] + " ");
            printReverse(array, n - 1);
        }
    }

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

        // Print the array in reverse order
        printReverse(array, n);
    }
}
