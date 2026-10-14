/*
Q37. Smallest digit
Example:
Input: 492
Output: 2
 */

import java.util.Scanner;

public class Q37_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(smallestDigit(n));
    }

    public static int smallestDigit(int n) {
        if (n/10 == 0) {
            return Math.abs(n%10);
        }

        return Math.min(Math.abs(n%10), smallestDigit(n/10));
    }
}
