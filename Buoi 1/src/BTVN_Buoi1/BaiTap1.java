package BTVN_Buoi1;

import java.util.Scanner;

public class BaiTap1 {
    public static String ConvertBase (int decNumber, int base) {
        String digits = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();

        while (decNumber > 0) {
            int mod = decNumber % base;
            result.insert(0, digits.charAt(mod)); //chen phan du vao
            decNumber /= base;
        }
        return result.toString();
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thap phan: ");
        int decNumber = scanner.nextInt();
        System.out.print("Nhap he co so muon chuyen: ");
        int base = scanner.nextInt();

        if (base < 2 || base > 16) {
            System.out.println("He co so ko hop le!");
            return;
        }

        String result = ConvertBase(decNumber, base);
        System.out.println("Chuyen sang he " + base + " la: " + result);
    }
}
