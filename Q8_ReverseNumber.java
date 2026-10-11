/*
Q8. Reverse a number
Example:
Input: N = 123
Output: 321
 */

import java.util.Scanner;

public class Q8_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(reverseNumber(n, 0));
    }

    public static int reverseNumber(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        rev = rev*10 + n%10;

        return reverseNumber(n/10, rev);
    }
}
