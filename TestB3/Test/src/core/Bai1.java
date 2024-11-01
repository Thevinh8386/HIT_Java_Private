package core;

import java.util.Scanner;

public class Bai1 {
    private static final String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    private static final String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
    private static final String[] hundreds = {"", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};

    public static String numberToWords(int n) {
        if (n < 10) {
            return units[n];
        } else if (n < 20) {
            return "mười " + units[n % 10];
        } else if (n < 100) {
            return tens[n / 10] + (n % 10 != 0 ? " " + units[n % 10] : "");
        } else if (n < 1000) {
            int mod = n % 100;
            if (mod == 0) {
                return hundreds[n / 100];
            } else if (mod < 10) {
                return hundreds[n / 100] + " lẻ " + units[mod];
            } else if (mod < 20) {
                return hundreds[n / 100] + " mười " + units[mod % 10];
            } else {
                return hundreds[n / 100] + " " + tens[mod / 10] + (mod % 10 != 0 ? " " + units[mod % 10] : "");
            }
        }
        return "";
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(numberToWords(n)); 
    }
}
