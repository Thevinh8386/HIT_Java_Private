package Homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin sv thứ " + i);
            System.out.print("Nhập mã sinh viên: ");
            String studentCode = sc.next();
            System.out.print("Nhập tên đầy đủ: ");
            String fullName = sc.next();
            System.out.print("Nhập tuổi: ");
            sc.nextLine();
            byte age = sc.nextByte();
            System.out.print("Nhập giới tính: ");
            String gender = sc.next();
            System.out.print("Nhập SĐT: ");
            String phoneNumber = sc.next();
            System.out.print("Nhập email: ");
            String email = sc.next();
            sc.nextLine();
            System.out.println();
            students.add(new Student(studentCode, fullName, age, gender, phoneNumber, email));
        }
        System.out.println("Bảng thông tin sinh viên:");
        System.out.println(String.format("%-15s %-20s %-10s %-10s %-15s %-30s",
                "Student Code", "Full Name", "Age", "Gender", "Phone Number", "Email"));
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (Student student : students) {
            student.display();
        }
    }
}
