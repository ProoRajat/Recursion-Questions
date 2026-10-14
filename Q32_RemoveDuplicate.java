/*
Q32. Remove duplicates
Example:
Input: "aabb"
Output: "ab"
 */

import java.util.Scanner;

public class Q32_RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(removeDuplicate(s, 0, new boolean[26]));
    }

    public static String removeDuplicate(String s, int idx, boolean[] seen) {
        if (idx == s.length()) {
            return "";
        }

        char ch = s.charAt(idx);
        if (seen[ch - 'a']) {
            return removeDuplicate(s, idx + 1, seen);
        }
        seen[ch-'a'] = true;
        return ch + removeDuplicate(s, idx + 1, seen);
    }
}
