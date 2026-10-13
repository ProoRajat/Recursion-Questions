/*
Q15. Count element occurrences
Example:
Input: [1, 2, 2, 3], key = 2
Output: 2
 */

import java.util.Scanner;

public class Q15_CountElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(count(arr, 0, x));
    }

    public static int count(int[] arr, int n, int key) {
        if (n == arr.length) {
            return 0;
        }

        int c = (arr[n] == key) ? 1 : 0;

        return c + count(arr, n+1, key);
    }
}
