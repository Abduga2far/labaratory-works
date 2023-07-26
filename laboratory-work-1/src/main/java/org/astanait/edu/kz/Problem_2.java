package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_2 {
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

        // Calculate the average of the elements in the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        float average = (float) sum / n;

        // Print the average
        System.out.println("The average is: " + average);
    }
}
