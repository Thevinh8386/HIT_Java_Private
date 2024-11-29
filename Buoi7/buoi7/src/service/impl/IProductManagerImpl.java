package service.impl;

import model.PhysicalProduct;
import model.Product;
import service.IProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IProductManagerImpl implements IProductManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<PhysicalProduct> productList = new ArrayList<>();

    public IProductManagerImpl() {
//        productList.add(new PhysicalProduct("P001", "Laptop Dell G3", 1500.0f, 10));
//        productList.add(new PhysicalProduct("P002", "iPhone 15 Pro Max", 1200.0f, 5));
//        productList.add(new PhysicalProduct("P003", "Samsung Galaxy Tab S9", 900.0f, 7));
//        productList.add(new PhysicalProduct("P004", "Sony WH-1000XM5 Headphones", 350.0f, 20));
//        productList.add(new PhysicalProduct("P005", "Apple Watch Series 9", 400.0f, 15));
    }
    //Thêm sản phẩm mới
    @Override
    public boolean addNewProduct(PhysicalProduct p) {
        try {
            for (PhysicalProduct product : productList) {
                if (product.getId().equalsIgnoreCase(p.getId())) {
                    throw new IllegalAccessException("ID sản phẩm này đã tồn tại!");
                }
            }
            productList.add(p);
            return true;
        } catch (IllegalAccessException ex) {
            System.err.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Lỗi không xác định khi thêm sản phẩm: " + ex.getMessage());
        }
        return false;
    }

    //Hiển thị danh sách sản phẩm
    @Override
    public void displayProduct() {
        if (!productList.isEmpty()) {
            System.out.println("Danh sách các sản phẩm: ");
            for (PhysicalProduct product : productList) {
                System.out.println(product);
            }
        }
        else {
            System.out.println("Danh sách đang trống!");
        }
    }

    //Tìm kiếm sản phẩm theo tên
    @Override
    public List<PhysicalProduct> searchByName(String name) {
        try {
            List<PhysicalProduct> result = new ArrayList<>();
            for (PhysicalProduct product : productList) {
                if (product.getName().equalsIgnoreCase(name)) {
                    result.add(product);
                }
            }
            if (result.isEmpty()) {
                throw new IllegalAccessException("Không tìm thấy sản phẩm có tên: " + name);
            }
            return result;
        } catch (IllegalAccessException ex) {
            System.err.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Lỗi không xác định khi tìm kiếm sản phẩm: " + ex.getMessage());
        }
        return new ArrayList<>(); //Trả về list rỗng nếu xảy ra lỗi
    }

    //Xóa sản phẩm theo id
    @Override
    public boolean deleteByMaSP(String id) {
        try {
            for (Product product : productList) {
                if (product.getId().equals(id)) {
                    productList.remove(product);
                    return true;
                }
            }
            throw new IllegalAccessException("Không tồn tại sản phẩm có id: " + id);
        } catch (IllegalAccessException ex) {
            System.err.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Lỗi không xác định khi xóa sản phẩm: " + ex.getMessage());
        }
        return false;
    }

    //Cập nhật sản phẩm
    @Override
    public boolean updateProduct(PhysicalProduct p) {
        try {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == p.getId()) {
                    productList.set(i, p);
                    return true;
                }
            }
            throw new IllegalAccessException("Không tìm thấy sản phẩm có id: " + p.getId());
        } catch (IllegalAccessException ex) {
            System.err.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Lỗi không xác định khi cập nhật thông tin sản phẩm: " + ex.getMessage());
        }
        return false;
    }
}
