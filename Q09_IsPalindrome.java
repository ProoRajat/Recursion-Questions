/*
Q9. Check palindrome number
Example:
Input: N = 121
Output: True
 */

import java.util.Scanner;

public class Q9_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        if (n < 0 || (n%10 == 0 && n != 0)) {
            return false;
        }
        return check(n, 0);
    }

    public static boolean check(int n, int reverseHalf) {
        if (n == reverseHalf || n/10 == reverseHalf) {
            return true;
        }

        if (n < reverseHalf) {
            return false;
        }

        return check(n/10, reverseHalf*10 + n%10);
    }
}
