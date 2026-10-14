/*
Q39. Count consonants
Example:
Input: "code"
Output: 2
 */

import java.util.Scanner;

public class Q39_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countConsonant(s, 0));
    }

    public static int countConsonant(String s, int idx) {
        if (idx == s.length()) {
            return 0;
        }

        char ch = s.charAt(idx);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return countConsonant(s, idx+1);
        }

        return 1 + countConsonant(s, idx+1);
    }
}
