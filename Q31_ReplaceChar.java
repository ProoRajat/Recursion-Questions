/*
Q31. Replace character
Example:
Input: "cat", a → o
Output: "cot"
 */

import java.util.Scanner;

public class Q31_ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        char val = sc.next().charAt(0);

        System.out.println(replaceChar(s, ch, val));
    }

    public static String replaceChar(String s, char ch, char newVal) {
        if (s.isEmpty()) {
            return "";
        }

        char first = (s.charAt(0) == ch) ? newVal : s.charAt(0);
        return first + replaceChar(s.substring(1), ch, newVal);
    }
}
