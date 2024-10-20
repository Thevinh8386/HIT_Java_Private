package BTVN_Buoi1;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap so luong so nguyen: ");
//        int n = scanner.nextInt();
        int[] arr = new int[5];
        System.out.println("Nhap day so nguyen n: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2)
                max2 = arr[i];
        }
        System.out.println("Hai so lon nhat lan luot la: " + max2 + " va " + max1);
    }
}
