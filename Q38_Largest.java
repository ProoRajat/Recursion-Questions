/*
Q38. Largest digit
Example:
Input: 492
Output: 9
 */

import java.util.Scanner;

public class Q38_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(largestDigit(n));
    }

    public static int largestDigit(int n) {
        if (n/10 == 0) {
            return Math.abs(n%10);
        }

        return Math.max(Math.abs(n%10), largestDigit(n/10));
    }
}
