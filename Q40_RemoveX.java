/*
Q40. Remove character x
Example:
Input: "xoxo"
Output: "oo"
 */

import java.util.Scanner;

public class Q40_RemoveX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(removeX(s, 0));
    }

    public static String removeX(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }

        char c = s.charAt(idx);
        if (c == 'x') {
            return removeX(s, idx+1);
        }

        return c + removeX(s, idx+1);
    }
}
