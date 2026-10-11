/*
 Q1. Print numbers from 1 to N
 Example:
 Input: N = 5
 Output: 1 2 3 4 5
 */

import java.util.Scanner;

public class Q1_PrintNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Valid Integer:");
            int n = sc.nextInt();

            printUpTo(n);
        }
    }

    public static void printUpTo(int n) {
        if (n < 1)
            return;

        printUpTo(n - 1);
        System.out.print(n + " ");
    }
}
