package org.astanait.edu.kz;

import java.util.Scanner;

public class Problem_8 {
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return true;
        } else if (!Character.isDigit(s.charAt(0))) {
            return false;
        } else {
            return isAllDigits(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isAllDigits(s));
    }
}
