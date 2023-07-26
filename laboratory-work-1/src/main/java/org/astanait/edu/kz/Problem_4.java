package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_4 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
