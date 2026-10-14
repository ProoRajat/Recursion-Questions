/*
Q2. Print numbers from N to 1
Example:
Input: N = 5
Output: 5 4 3 2 1
*/

import java.util.Scanner;

public class Q02_PrintNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a valid Number:");
            int n = sc.nextInt();

            printFrom(n);
        }
    }

    public static void printFrom(int n) {
        if (n < 1)
            return;

        System.out.print(n + " ");
        printFrom(n-1);
    }
}
