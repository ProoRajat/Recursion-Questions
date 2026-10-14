/*
Q35. Check strictly increasing
Example:
Input: [1, 2, 3]
Output: True
 */

import java.util.Scanner;

public class Q35_isIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isStrictlyIncreasing(arr, 0));
    }

    public static boolean isStrictlyIncreasing(int[] arr, int n) {
        if (n == arr.length - 1 || arr.length == 0) {
            return true;
        }

        if (arr[n] >= arr[n+1]) {
            return false;
        }

        return isStrictlyIncreasing(arr, n+1);
    }
}
