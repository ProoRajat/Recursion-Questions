/*
Q42. Check string contains only digits
Example:
Input: "1234"
Output: True
 */

import java.util.Scanner;

public class Q42_isDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isDigits(s, 0));
    }

    public static boolean isDigits(String s, int idx) {
        if (idx == s.length()) {
            return true;
        }

        char c = s.charAt(idx);
        if (c > '9' || c < '0') {
            return false;
        }

        return isDigits(s, idx+1);
    }
}
