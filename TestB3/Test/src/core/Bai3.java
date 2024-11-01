package core;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        int y = sc.nextInt();
        double result = Math.pow(x, 1.0*y);
        if (x < -100.0 || x > 100.0) {
            throw new IllegalArgumentException("Giá trị của x phải nằm trong khoảng -100.0 <= x <= 100");
        }
        if (y < -(1 << 31) || y > (1 << 31) - 1) {
            throw new IllegalArgumentException("Giá trị của y phải nằm trong khoảng -2^31 <= y <= 2^31 - 1");
        }
        System.out.println(result);
    }
}
