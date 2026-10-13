/*
Q13. Sum of array elements
Example:
Input: [1, 2, 3]
Output: 6
 */

import java.util.Scanner;

public class Q13_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sum(arr, n-1));
    }

    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }

        return arr[n] + sum(arr, n-1);
    }
}
