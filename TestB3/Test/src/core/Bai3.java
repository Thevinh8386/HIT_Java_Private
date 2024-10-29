package core;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        int y = sc.nextInt();
        double result = Math.pow(x, 1.0*y);
        if (x >= -100 && x <= 100) {
            System.out.println(result);
        }
    }
}
