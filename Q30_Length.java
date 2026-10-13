/*
Q30. Length of string
Example:
Input: "hello"
Output: 5
 */

import java.util.Scanner;

public class Q30_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(length(s));
    }

    public static int length(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        return 1 + length(s.substring(1));
    }
}
