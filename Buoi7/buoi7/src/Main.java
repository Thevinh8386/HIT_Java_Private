import model.PhysicalProduct;
import model.Role;
import service.IUserManager;
import service.IProductManager;
import service.impl.IUserManagerImpl;
import service.impl.IProductManagerImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IUserManager userService = new IUserManagerImpl();
        IProductManager productService = new IProductManagerImpl();

        //Khởi tạo sẵn một vài sản phẩm
        productService.addNewProduct(new PhysicalProduct("P001", "Laptop Dell G3", 1500.0f, 10));
        productService.addNewProduct(new PhysicalProduct("P002", "iPhone 15 Pro Max", 1200.0f, 5));System.out.println("Hãy đăng nhập để tiếp tục: ");
        productService.addNewProduct(new PhysicalProduct("P003", "Samsung Galaxy Tab S9", 900.0f, 7));userService.login(sc);
        productService.addNewProduct(new PhysicalProduct("P004", "Sony WH-1000XM5 Headphones", 350.0f, 20));System.out.println();
        productService.addNewProduct(new PhysicalProduct("P005", "Apple Watch Series 9", 400.0f, 15));

        while (true) {
            if (userService.getCurrentUser() != null) {
                if (userService.getCurrentUser().getRole() == Role.ADMIN) {
                    //ADMIN MENU
                    System.out.println("=== Quản lý Sản phẩm (Admin) ===");
                    System.out.println("1. Thêm sản phẩm");
                    System.out.println("2. Hiển thị danh sách sản phẩm");
                    System.out.println("3. Tìm kiếm sản phẩm theo tên");
                    System.out.println("4. Xóa sản phẩm theo mã");
                    System.out.println("5. Cập nhật thông tin sản phẩm");
                    System.out.println("6. Logout");
                    System.out.println("7. Thoát");
                    System.out.println("Lựa chọn của bạn: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            try {
                                //Nhập thông tin
                                System.out.println("Nhập thông tin sản phẩm: ");
                                System.out.println("Nhập id: ");
                                String id = sc.nextLine();

                                System.out.println("Nhập tên: ");
                                String name = sc.nextLine();

                                System.out.println("Nhập giá: ");
                                float price = sc.nextFloat();
                                sc.nextLine();

                                System.out.println("Nhập số lượng: ");
                                int quantity = sc.nextInt();
                                sc.nextLine();

                                PhysicalProduct product = new PhysicalProduct(id, name, price, quantity);
                                if (productService.addNewProduct(product)) {
                                    System.out.println("Thêm sản phẩm thành công!");
                                } else {
                                    System.out.println("Thêm nhân sự thất bại!");
                                }
                            } catch (NumberFormatException ex) {
                                System.err.println("Lỗi nhập sai định dạng số: " + ex.getMessage());
                            }
                            System.out.println("------------------------------------------------");
                            break;

                        case 2:
                            productService.displayProduct();
                            System.out.println("--------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("Nhập tên sản phẩm cần tìm: ");
                            String name = sc.nextLine();
                            List<PhysicalProduct> phyproduct = productService.searchByName(name);
                            if (!phyproduct.isEmpty()) {
                                for (PhysicalProduct p : phyproduct) {
                                    System.out.println("Tồn tại sản phẩm có tên là: " + name);
                                    System.out.println("Thông tin sản phẩm là: ");
                                    System.out.println(p.toString());
                                }
                            }
                            System.out.println("----------------------------------------------------");
                            break;
                        case 4:
                            System.out.println("Nhập mã sản phẩm muốn xóa: ");
                            String id = sc.nextLine();
                            if (productService.deleteByMaSP(id)) {
                                System.out.println("Xóa thành công sản phẩm có id: " + id);
                            } else {
                                System.out.println("Xóa sản phẩm thất bại!");
                            }
                            System.out.println("---------------------------------------------------");
                            break;
                        case 5:
                            try {
                                System.out.println("Nhập thông tin sản phẩm cần sửa: ");
                                System.out.println("Nhập id mới: ");
                                String new_id = sc.nextLine();

                                System.out.println("nhập tên mới: ");
                                String new_name = sc.nextLine();

                                System.out.println("Nhập giá mới: ");
                                float new_price = sc.nextFloat();
                                sc.nextLine();

                                System.out.println("Nhập số lượng: ");
                                int new_quantity = sc.nextInt();
                                sc.nextLine();

                                PhysicalProduct product = new PhysicalProduct(new_id, new_name, new_price, new_quantity);
                                if (productService.updateProduct(product)) {
                                    System.out.println("Cập nhật thông tin thành công!");
                                    System.out.println("Thông tin sản phẩm sau cập nhật là: ");
                                    System.out.println(product.toString());
                                } else {
                                    System.out.println("Cập nhật thông tin thất bại!");
                                }
                            } catch (NumberFormatException ex) {
                                System.err.println("Lỗi nhập sai định dạng số: " + ex.getMessage());
                            }
                            System.out.println("-------------------------------------------------------");
                            break;
                        case 6:
                            userService.logout();
                            System.out.println("--------------------------------------------------------");
                            break;
                        case 7:
                            System.out.println("Thoát chương trình!");
                            return;
                        default:
                            System.out.println("Invalid choice! Vui lòng nhập lại.");
                    }

                } else {
                    // CUSTOMER MENU
                    System.out.println("=== Xem Sản phẩm (Customer) ===");
                    System.out.println("1. Hiển thị danh sách sản phẩm");
                    System.out.println("2. Tìm kiếm sản phẩm theo tên");
                    System.out.println("3. Logout");
                    System.out.println("4. Thoát");
                    System.out.println("Lựa chọn của bạn: ");
                    int option = sc.nextInt();
                    sc.nextLine();

                    switch (option) {
                        case 1:
                            productService.displayProduct();
                            System.out.println("----------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("Nhập tên sản phẩm cần tìm: ");
                            String name = sc.nextLine();
                            List<PhysicalProduct> phyproduct = productService.searchByName(name);
                            if (!phyproduct.isEmpty()) {
                                for (PhysicalProduct p : phyproduct) {
                                    System.out.println("Tồn tại sản phẩm có tên là: " + name);
                                    System.out.println("Thông tin sản phẩm là: ");
                                    System.out.println(p.toString());
                                }
                            }
                            System.out.println("---------------------------------------------------------");
                            break;
                        case 3:
                            userService.logout();
                            System.out.println("---------------------------------------------------------");
                            break;
                        case 4:
                            System.out.println("Thoát chương trình!");
                            return;
                        default:
                            System.out.println("Invalid choice! Vui lòng nhập lại.");
                    }
                }
            }
        }

    }
}
