package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_6 {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int powerOfA = power(a, n);
        System.out.println("The power of " + a + " raised to " + n + " is: " + powerOfA);
    }
}
