/*
Print array elements
Example:
Input: [1, 2, 3]
Output: 1 2 3
 */

import java.util.Scanner;

public class Q18_PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        print(arr, 0);
    }

    public static void print(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }

        System.out.print(arr[n] + " ");
        print(arr, n+1);
    }
}
