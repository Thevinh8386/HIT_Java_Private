package BTVN_Buoi1;

import java.util.Scanner;

public class BaiTap2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        int result = 1;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            result *= digit;
            n /= 10;
        }
        System.out.println("Tich cac chu so la: " + result);
    }
}
