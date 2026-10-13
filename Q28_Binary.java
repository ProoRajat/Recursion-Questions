/*
Q28. Decimal to binary
Example:
Input: 5
Output: 101
 */

import java.util.Scanner;

public class Q28_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        toBinary(n);
    }

    public static void toBinary(int n) {
        if (n == 1 || n == 0) {
            System.out.print(n);
            return;
        }

        toBinary(n/2);
        System.out.print(n % 2);
    }
}
