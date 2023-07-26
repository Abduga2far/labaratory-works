package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_5 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibonacciNumber = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }
}
