package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }
}
