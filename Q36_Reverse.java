/*
Q36. Print array in reverse
Example:
Input: [1, 2, 3]
Output: 3 2 1
 */

import java.util.Scanner;

public class Q36_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printReverse(arr, 0);
    }

    public static void printReverse(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }

        printReverse(arr, n+1);
        System.out.print(arr[n] + " ");
    }
}
