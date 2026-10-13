/*
Q16. First occurrence in array
Example:
Input: [1, 2, 3, 2], key = 2
Output: index 1
 */

import java.util.Scanner;

public class Q16_FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(indexOf(arr, 0, x));
    }

    public static int indexOf(int[] arr, int n, int val) {
        if (n == arr.length) {
            return -1;
        }

        return (arr[n] == val) ? n : indexOf(arr, n+1, val);
    }
}
