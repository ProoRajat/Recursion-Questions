/*
Q17. Last occurrence in array
Example:
Input: [1, 2, 3, 2], key = 2
Output: index 3
 */

import java.util.Scanner;

public class Q17_LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(lastIndexOf(arr, n-1, x));
    }

    public static int lastIndexOf(int[] arr, int n, int val) {
        if (n == -1) {
            return -1;
        }

        return (arr[n] == val) ? n : lastIndexOf(arr, n-1, val);
    }
}
