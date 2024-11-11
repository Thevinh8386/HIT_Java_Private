package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		//Khởi tạo mảng
		books.add(new Book(1, "Book A", "Author A", 1999, "Content A", 150.0));
        books.add(new Book(2, "Book C", "Author B", 2005, "Content C", 100.0));
        books.add(new Book(3, "Book D", "Author C", 1989, "Content D", 170.0));
        books.add(new Book(4, "Book B", "Author D", 2019, "Content B", 200.0));
        books.add(new Book(5, "Book E", "Author E", 2018, "Content E", 250.0));
        
        while (true) {
        	System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Chỉnh sửa thông tin sách");
            System.out.println("3. In ra danh sách các cuốn sách có trong mảng");
            System.out.println("4. In ra cuốn sách lâu đời cổ kính nhất");
            System.out.println("5. In ra cuốn sách phù hợp với giá tiền");
            System.out.println("6. Sắp xếp lại danh sách các cuốn sách (theo tên hoặc theo giá tiền)");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            	case 1:
            		addBook(sc, books);
            		break;
            	case 2:
            		editBook(sc, books);
            		break;
            	case 3:
            		displayBook(books);
            		break;
            	case 4:
            		displayOldestBook(books);
            		break;
            	case 5:
            		bookByPrice(sc, books);
            		break;
            	case 6:
            		sortBook(sc, books);
            		break;
            	case 0:
            		System.out.println("Thoát chương trình...");
            		sc.close();
            		return;
            	default:
            		System.out.println("Tùy chọn không hợp lệ, vui lòng thử lại.");	
            }
        }
	}	
        
    // 1. Thêm sách mới
    public static void addBook(Scanner sc, ArrayList<Book> books) {
    	System.out.print("Nhập mã sách: ");
    	int maSach = sc.nextInt();
    	sc.nextLine(); 
    	System.out.print("Nhập tên sách: ");
    	String tenSach = sc.nextLine();
    	System.out.print("Nhập tên tác giả: ");
        String tenTacGia = sc.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhập tóm tắt nội dung: ");
        String tomTatNoiDung = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        double giaTien = sc.nextDouble();
        Book newBook = new Book(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien);
        books.add(newBook);
        System.out.println("Thêm sách mới thành công!");
    }
        
    // 2. Chỉnh sửa thông tin sách
    public static void editBook(Scanner sc, ArrayList<Book> books) {
    	System.out.print("Nhập mã sách để chỉnh sửa: ");
        int maSach = sc.nextInt();
        sc.nextLine();

        for (Book book : books) {
        	if (book.getMaSach() == maSach) {
        		System.out.print("Nhập tên sách mới: ");
        		book.setTenSach(sc.nextLine());
        		System.out.print("Nhập tên tác giả mới: ");
        		book.setTenTacGia(sc.nextLine());
        		System.out.print("Nhập năm sản xuất mới: ");
        		book.setNamSanXuat(sc.nextInt());
        		sc.nextLine();
        		System.out.print("Nhập tóm tắt nội dung mới: ");
        		book.setTomTatNoiDung(sc.nextLine());
        		System.out.print("Nhập giá tiền mới: ");
        		book.setGiaTien(sc.nextDouble());
        		System.out.println("Chỉnh sửa thông tin sách thành công!");
        		return;
        	}
        }
        System.out.println("Không tìm thấy sách với mã sách trên.");
    }

    // 3. In ra danh sách các cuốn sách
    public static void displayBook(ArrayList<Book> books) {
    	for (Book book : books)
    		book.display();
        }

    // 4. In ra cuốn sách lâu đời cổ kính nhất
    public static void displayOldestBook(ArrayList<Book> books) {
    	Book oldestBook = Collections.min(books, Comparator.comparingInt(Book::getNamSanXuat));
        System.out.println("Cuốn sách lâu đời nhất là:");
        oldestBook.display();
    }

    // 5. In ra cuốn sách phù hợp với giá tiền người mua yêu cầu
    public static void bookByPrice(Scanner sc, ArrayList<Book> books) {
    	System.out.print("Nhập giá tiền mong muốn: ");
        double targetPrice = sc.nextDouble();
        boolean found = false;
        for (Book book : books) {
        	if (book.getGiaTien() <= targetPrice) {
                book.display();
                found = true;
            }
        }

        if (!found) {
        	System.out.println("Không tìm thấy sách phù hợp với giá tiền yêu cầu.");
        }
    }

    // 6. Sắp xếp sách (theo tên hoặc giá tiền)
    public static void sortBook(Scanner sc, ArrayList<Book> books) {
    	System.out.println("Sắp xếp theo: 1. Tên, 2. Giá tiền");
        int sortChoice = sc.nextInt();

        if (sortChoice == 1) {
        	books.sort(Comparator.comparing(Book::getTenSach));
            System.out.println("Đã sắp xếp theo tên.");
        } 
        else if (sortChoice == 2) {
            books.sort(Comparator.comparingDouble(Book::getGiaTien));
            System.out.println("Đã sắp xếp theo giá tiền.");
        } 
        else {
            System.out.println("Lựa chọn không hợp lệ.");
            return;
        }
        displayBook(books);
    }   
}
