/*
Q11. Maximum element in array
Example:
Input: [1, 5, 3]
Output: 5
 */

import java.util.Scanner;

public class Q11_MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxElement(arr, arr.length - 1));
    }

    private static int maxElement(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }

        return Math.max(arr[n], maxElement(arr, n-1));
    }
}
