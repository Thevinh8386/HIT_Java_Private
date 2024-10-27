package core;
import java.util.Scanner;

public class Bai2 {
    public static long maxSumSub(int[] arr, int n, int k) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(sum, maxSum);
        }

        long total = sum;
        for (int i = k; i < n; i++) {
            total += arr[i];
            maxSum = Math.max(maxSum, total);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[100005];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSumSub(arr, n, k));
    }
}
