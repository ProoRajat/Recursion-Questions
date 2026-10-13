/*
Q23. LCM of two numbers
Example:
Input: a = 4, b = 6
Output: 12
 */

import java.util.Scanner;

public class Q23_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(LCM(a, b));
    }

    public static int LCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (Math.abs(a) / GCD(a,b)) * Math.abs(b);
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return GCD(b, a%b);
    }
}
