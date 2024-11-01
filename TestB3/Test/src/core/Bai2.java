package core;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int index = 0;
		int[] arr = new int[105];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				arr[index] = str.charAt(i) - '0';
				index++;
			}
			else 
				System.out.print(str.charAt(i));
		}
		System.out.println();
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i]);
		}
	}
}
