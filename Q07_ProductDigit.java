/*
Q7. Product of digits
Example:
Input: N = 234
Output: 24
 */

import java.util.Scanner;

public class Q07_ProductDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitProd(n));
    }

    public static int digitProd(int n) {
        if (n/10 == 0) {
            return Math.abs(n);
        }

        return Math.abs(n%10) * digitProd(n/10);
    }
}
