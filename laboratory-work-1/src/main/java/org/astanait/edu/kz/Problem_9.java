package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = binomialCoefficient(n, k);
        System.out.println("The binomial coefficient C(" + n + ", " + k + ") is: " + res);
    }
}
