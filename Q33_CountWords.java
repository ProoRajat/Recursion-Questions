/*
Q33. Count words
Example:
Input: "I love code"
Output: 3
 */

import java.util.Scanner;

public class Q33_CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countWords(s, 0, false));
    }

    public static int countWords(String s, int idx, boolean inWord) {
        if (idx == s.length()) {
            return 0;
        }

        char ch = s.charAt(idx);

        if (Character.isWhitespace(ch)) {
            return countWords(s, idx+1, false);
        }

        if (!inWord) {
            return 1 + countWords(s, idx+1, true);
        }

        return countWords(s, idx+1, true);
    }
}
