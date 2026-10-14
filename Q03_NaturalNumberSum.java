/*
Q3. Sum of first N natural numbers
Example:
Input: N = 5
Output: 15
 */

import java.util.Scanner;

public class Q3_NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Program only accept natural numbers");
            System.exit(0);
        }

        System.out.println(sum(n));

        sc.close();
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
}
