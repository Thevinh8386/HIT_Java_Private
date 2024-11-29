package service.impl;

import model.Role;
import model.User;
import service.IUserManager;

import java.util.ArrayList;
import java.util.Scanner;

public class IUserManagerImpl implements IUserManager {
    private static ArrayList<User> userList = new ArrayList<>();
    private static User currentUser = null;

    public IUserManagerImpl() {
        userList.add(new User("001", "HIT CLUB DCN", "hitclub", "hit18082010", Role.ADMIN));
        userList.add(new User("002", "Đỗ Văn A", "customer1", "customer123", Role.CUSTOMER));
        userList.add(new User("003", "Trần Thị B", "customer2", "customer123", Role.CUSTOMER));
        userList.add(new User("004", "Lê Văn C", "customer3", "cust2023", Role.CUSTOMER));
        userList.add(new User("005", "Phạm Minh D", "superadmin", "super123", Role.ADMIN));
        userList.add(new User("006", "Hoàng Thị E", "customer4", "pass12345", Role.CUSTOMER));
    }

    //ĐĂNG NHẬP
    @Override
    public void login(Scanner sc) {
        while (true) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            for (User user : userList) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    currentUser = user;
                    System.out.println("Login successfully!");
                    return;
                }
            }
            System.out.println("Invalid email or password!");
        }
    }


    @Override
    public User getCurrentUser() {
        return currentUser;
    }

    //ĐĂNG XUẤT
    @Override
    public void logout() {
        if (currentUser != null) {
            System.out.println("Logout successfully!");
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in!");
        }
    }
}

//abstract ko thể tạo lớp instance
//Check ADMIN
//    private boolean isAdmin() {
//        if (currentUser == null || currentUser.getRole() != Role.ADMIN) {
//            System.out.println("Access denied. Admin only.");
//            return false;
//        }
//        return true;
//    }