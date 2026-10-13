/*
Q20. Count vowels in string
Example:
Input: "coding"
Output: 2
 */

import java.util.Scanner;

public class Q20_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countVowel(s, 0));
    }

    public static int countVowel(String s, int n) {
        if (n == s.length()) {
            return 0;
        }

        int count = 0;
        char ch = s.charAt(n);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count = 1;

        return count + countVowel(s, n+1);
    }
}
