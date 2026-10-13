/*
Q19. Count even numbers
Example:
Input: [1, 2, 4]
Output: 2
 */

import java.util.Scanner;

public class Q19_Count_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countEven(arr, 0));
    }

    public static int countEven(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }

        return (((arr[n]&1) == 0) ? 1 : 0) + countEven(arr, n+1);
    }
}
