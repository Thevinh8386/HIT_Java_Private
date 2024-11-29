import service.IUserService;
import service.impl.IUserServiceImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IUserService userService = new IUserServiceImpl();

        //MENU
        while (true) {
            System.out.println("\n--- Quản lý thành viên HIT ---");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách thành viên");
            System.out.println("3. Thêm thành viên (only admin)");
            System.out.println("4. Xóa thành viên (only admin)");
            System.out.println("5. Đăng xuất");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    userService.login(sc);
                    System.out.println("------------------------------------------------------------------");
                    break;
                case 2:
                    userService.displayUser();
                    System.out.println("------------------------------------------------------------------");
                    break;
                case 3:
                    userService.addUser();
                    break;
                case 4:
                    userService.deleteUser();
                    System.out.println("Danh sách thành viên sau khi xóa là: ");
                    userService.displayUser();
                    System.out.println("------------------------------------------------------------------");
                    break;
                case 5:
                    userService.logout();
                    System.out.println("------------------------------------------------------------------");
                    break;
                case 6:
                    System.exit(0);
                    System.out.println("Exit successful");
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
