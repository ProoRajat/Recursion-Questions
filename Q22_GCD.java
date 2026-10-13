/*
Q22. GCD of two numbers
Example:
Input: a = 12, b = 18
Output: 6
 */

import java.util.Scanner;

public class Q22_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(GCD(a, b));
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return GCD(b, a%b);
    }
}
