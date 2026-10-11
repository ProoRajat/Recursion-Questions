/*
Q6. Count digits
Example:
Input: N = 9876
Output: 4
 */

import java.util.Scanner;

public class Q6_CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countDigit(n));
    }

    public static int countDigit(int n) {
        if (n/10 == 0) {
            return 1;
        }

        return 1 + countDigit(n/10);
    }
}
