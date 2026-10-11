/*
Q10. Power a^b
Example:
Input: a = 2, b = 4
Output: 16
 */

import java.util.Scanner;

public class Q10_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(pow(a,b));
    }

    public static long pow(long a, int b) {
        if (b == 0) {
            return 1;
        }

        long half = pow(a, b/2);
        if (b%2 == 0) {
            return half * half;
        } else {
            return half * half * a;
        }
    }
}
