import model.Role;
import model.Status;
import service.IAccountService;
import service.IAuthService;
import service.impl.IAccountServiceImpl;
import service.impl.IAuthServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IAuthService authService = new IAuthServiceImpl();
        IAccountService accountService = new IAccountServiceImpl();

        accountService.createNewAccount("hitclub15", "18082010", Role.ADMIN, Status.ACTIVE);
        accountService.createNewAccount("vinh123", "02022005", Role.USER, Status.ACTIVE);
        accountService.createNewAccount("vuong123", "12345678", Role.USER, Status.ACTIVE);
        accountService.createNewAccount("vu123", "345678910", Role.USER, Status.ACTIVE);
        accountService.createNewAccount("tuantu123", "tuantu22", Role.USER, Status.BAN);

        System.out.println("Login to continue");
        authService.login(sc);
        System.out.println();

        while (true) {
            if (authService.getCurrentPerson() != null) {
                if (authService.getCurrentPerson().getRole() == Role.ADMIN) {
                    //ADMIN MENU
                    System.out.println("=== He thong quan ly tai khoan ===");
                    System.out.println("Xin chao ADMIN: [user cua admin]");
                    System.out.println("1. Xem danh sach san pham");
                    System.out.println("2. Tao tai khoan moi");
                    System.out.println("3. Tim kiem tai khoan theo username");
                    System.out.println("4. Xoa tai khoan");
                    System.out.println("5. Thay doi trang thai tai khoan (ACTIVE/BAN)");
                    System.out.println("6. Xem thong tin ca nhan");
                    System.out.println("0. Dang xuat");
                    System.out.println("Lựa chọn của bạn: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                    }

                }
                else {

                }
        }
    }
}}