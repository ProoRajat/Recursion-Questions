/*
Q24. Sum of even digits
Example:
Input: 1234
Output: 6
 */

import java.util.Scanner;

public class Q24_EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumOfEven(n));
    }

    public static int sumOfEven(int n) {
        if (n == 0) {
            return 0;
        }

        int even = ((n%10 & 1) == 0) ? n%10 : 0;
        return even + sumOfEven(n/10);
    }
}
