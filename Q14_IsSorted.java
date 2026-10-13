/*
Q14. Check array sorted
Example:
Input: [1, 2, 3]
Output: True
 */

import java.util.Scanner;

public class Q14_IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, n-1));
    }

    public static boolean isSorted(int[] arr, int n) {
        if (n < 1) {
            return true;
        }

        if (arr[n] < arr[n-1]) {
            return false;
        }

        return isSorted(arr, n-1);
    }
}
