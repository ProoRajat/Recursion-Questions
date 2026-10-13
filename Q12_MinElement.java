/*
Q12. Minimum element in array
Example:
Input: [1, 5, 3]
Output: 1
 */

import java.util.Scanner;

public class Q12_MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minElement(arr, arr.length - 1));
    }

    public static int minElement(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }

        return Math.min(arr[n], minElement(arr, n-1));
    }
}
