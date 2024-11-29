package service.impl;

import model.Role;
import model.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.Scanner;

public class IUserServiceImpl implements IUserService {
    private static final ArrayList<User> userList = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private User nowUser = null;

    public IUserServiceImpl() {
        //Khởi tạo một list thành viên ban đầu
        userList.add(new User("001", "Admin", "admin@hitclub.com", "123456", 15, "2010-08-18", Role.ADMIN));
        userList.add(new User("002", "Nguyen The Vinh", "nguyenthevinh02022005@gmail.com", "vinhdzai225", 20, "2005-02-02", Role.USER));
        userList.add(new User("003", "Tran Van Nam", "tranvannam@gmail.com", "NamTran2024", 22, "2002-10-12", Role.USER));
        userList.add(new User("004", "Le Thi Hoa", "lehoa98@gmail.com", "HoaLe123", 25, "1998-06-05", Role.USER));
        userList.add(new User("005", "Pham Minh Khoa", "minhkhoa2000@gmail.com", "Khoa2000", 24, "2000-03-15", Role.USER));
    }

    //LOGIN
    @Override
    public void login(Scanner sc) {
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassWord().equals(password)) {
                nowUser = user;
                System.out.println("Đăng nhập thành công với vai trò là: " + user.getRole());
                return;
            }
        }
        System.out.println("Đăng nhập thất bại! Invalid email or password!");
    }

    @Override
    public void logout(){
        if(nowUser != null) {
            System.out.println("Đăng xuất thành công!");
            nowUser = null;
        } else {
            System.out.println("Hiện tại chưa có ai đăng nhập!");
        }
    }

    //Display
    @Override
    public void displayUser() {
        if(userList.isEmpty()) {
            System.out.println("Không tìm thấy thành viên nào!");
        } else{
            System.out.println("Danh sách thành viên: ");
            for(User user: userList){
                user.output();
            }
        }
    }

    //ADD USER
    @Override
    public void addUser() {
        if (nowUser == null || nowUser.getRole() != Role.ADMIN) {
            System.out.println("Bạn không phải admin nên không thể thêm thành viên mới!");
        }
        else {
            //Enter information
            System.out.println("Thêm user mới: ");
            System.out.print("Nhập ID: ");
            String id = sc.nextLine();
            System.out.print("Nhập name: ");
            String name = sc.nextLine();
            System.out.print("Nhập email: ");
            String email = sc.nextLine();
            System.out.print("Nhập password: ");
            String password = sc.nextLine();
            System.out.print("Nhập age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập birth: ");
            String birth = sc.nextLine();
            System.out.print("Nhập role (user/admin): ");
            String roleInput = sc.nextLine().toUpperCase();

            Role role;
            try {
                role = Role.valueOf(roleInput); // Chuyển kiểu string -> Role enum
            } catch (IllegalArgumentException e) {
                System.out.println("Role không hợp lệ! Mặc định sẽ là USER.");
                role = Role.USER; // Mặc định role là USER nếu không cung cấp role
            }

            userList.add(new User(id, name, email, password, age, birth, role));
            System.out.println("Thêm thành viên thành công!");
        }
    }

    //DELETE USER
    @Override
    public void deleteUser() {
        if (nowUser == null || nowUser.getRole() != Role.ADMIN) {
            System.out.println("Bạn không phải admin nên không có quyền xóa thành viên!");
            return;
        }
        System.out.print("Nhập ID thành viên cần xóa: ");
        String id = sc.nextLine();

        for (User user : userList) {
            if (user.getId().equalsIgnoreCase(id)) {
                userList.remove(user);
                System.out.println("Xóa thành viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy thành viên với ID này!");
    }
}
