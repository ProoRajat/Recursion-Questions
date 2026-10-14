/*
Q4. Factorial of N
Example:
Input: N = 5
Output: 120
 */

import java.util.Scanner;

public class Q04_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n-1);
    }
}
