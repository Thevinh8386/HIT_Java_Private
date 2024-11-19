package core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
    public static ArrayList<Student> students = new ArrayList<>();

    // Input
    public void inputStudent() {
    	Scanner sc = new Scanner(System.in);
        while (true) {
            Student student = new Student();
            System.out.println("Enter thông tin sinh viên (ID = 555 thì dừng): ");
            student.input();
            students.add(student);
            if (student.getId() == 555) 
            	break;
        }
    }
    
    // Output
    public void outputStudent() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("DANH SÁCH STUDENT");
        System.out.printf("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-10s \n", 
        		"Student name", "Age", "Commune", "District", "City", "ID", "Class", "Gpa");
        for (Student student : students) {
            student.output();
            System.out.println(); 
        }    
    }

    // SortByGpa
    public void sortByGpa() {
        students.sort(Comparator.comparing(Student::getGpa));
        System.out.println("Danh sách sau khi sắp xếp theo gpa: ");
        outputStudent();
    }
    
    // Remove    
    public void removeById() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID muốn xóa: ");
        int id = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Đã xóa sinh viên có ID: " + id);
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên có ID: " + id);
        }
    }
        
    
    public static void main(String[] args) {
    	ClassRoom classRoom = new ClassRoom();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
        	System.out.println("-------------------MENU--------------------");
            System.out.println("1. Nhập thông tin các sinh viên");
            System.out.println("2. In ra thông tin các sinh viên");
            System.out.println("3. Sắp xếp danh sách sinh viên theo gpa");
            System.out.println("4. Xóa sinh viên theo id");
            System.out.println("5. Exit");
            System.out.print("Hãy nhập sự lựa chọn của bạn: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: {
                    classRoom.inputStudent();
                    break;
                }
                case 2: {
                    classRoom.outputStudent();
                    break;
                }
                case 3: {
                    classRoom.sortByGpa();
                    break;
                }
                case 4: {
                    classRoom.removeById();
                    break;
                }
                case 5: {
                	System.exit(0);
                }
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
