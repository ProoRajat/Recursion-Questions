/*
Q34. Print all indexes
Example:
Input: [1, 2, 2], key = 2
Output: 1 2
 */

import java.util.Scanner;

public class Q34_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printIdx(arr, n-1, key);
    }

    public static void printIdx(int[] arr, int idx, int key) {
        if (idx == -1) {
            return;
        }

        printIdx(arr, idx-1, key);

        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
    }
}
