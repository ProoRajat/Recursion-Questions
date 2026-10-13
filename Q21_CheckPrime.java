/*
Q21. Check prime
Example:
Input: N = 7
Output: True
 */

import java.util.Scanner;

public class Q21_CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n, 2));
    }

    public static boolean isPrime(int n, int d) {
        if (n < 2) {
            return false;
        }

        if (d > n/d) {
            return true;
        }

        if (n%d == 0) {
            return false;
        }

        return isPrime(n, d+1);
    }
}
