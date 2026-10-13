/*
Q26. Count zeros in number
Example:
Input: 10020
Output: 3
 */

import java.util.Scanner;

public class Q26_CountZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countZeroes(n));
    }

    public static int countZeroes(int n) {
        if (n/10 == 0) {
            return (n == 0) ? 1 : 0;
        }

        return ((n%10 == 0) ? 1 : 0) + countZeroes(n/10);
    }
}
