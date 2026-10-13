/*
Q25. Remove zeros from number
Example:
Input: 1020
Output: 12
 */

import java.util.Scanner;

public class Q25_removeZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(removeZeroes(n));
    }

    public static int removeZeroes(int n) {
        if (n == 0) {
            return n;
        }

        return ((n%10 != 0) ? (n%10) + + removeZeroes(n/10)*10 : + removeZeroes(n/10)) ;
    }
}
