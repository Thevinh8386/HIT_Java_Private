package core;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+5];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] prefix = new int[n + 1];
		for (int i = 0; i < n; i++) {
			prefix[i+1] = prefix[i] + arr[i];
		}
		
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(prefix[r] - pref[l-1]);
		}
	}
}
