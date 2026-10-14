/*
Q5. Sum of digits
Example:
Input: N = 123
Output: 6
 */

import java.util.Scanner;

public class Q5_DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitSum(n));
    }

    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }

        return Math.abs(n%10) + digitSum(n/10);
    }
}
