/*
Q27. Digital root
Example:
Input: 987
Output: 6
 */

import java.util.Scanner;

public class Q27_DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitalRoot(n, 0));
    }

    public static int digitalRoot(int n, int sum) {
        if (n == 0) {
            if (sum/10 != 0) {
                return digitalRoot(sum, 0);
            }

            return sum;
        }

        return digitalRoot(n/10, sum + Math.abs(n%10));
    }
}
