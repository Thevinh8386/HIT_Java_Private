package service;

import model.PhysicalProduct;

import java.util.List;

public interface IProductManager {
    public boolean addNewProduct(PhysicalProduct p);
    public void displayProduct();
    public List<PhysicalProduct> searchByName(String name);
    public boolean deleteByMaSP(String id);
    public boolean updateProduct(PhysicalProduct p);
}
