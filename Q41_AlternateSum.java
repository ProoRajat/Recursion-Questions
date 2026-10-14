/*
Q41. Sum of alternate digits
Example:
Input: 1234
Output: 4
 */

import java.util.Scanner;

public class Q41_AlternateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = Integer.toString(n);

        if (s.startsWith("-")) {
            s = s.substring(1);
        }

        System.out.println(alternativeSum(s, 0));
    }

    public static int alternativeSum(String s, int idx) {
        if (idx >= s.length()) {
            return 0;
        }

        return (s.charAt(idx) -'0') + alternativeSum(s, idx+2);
    }
}
