package model;

public class PhysicalProduct extends Product {
    public PhysicalProduct(String id, String name, float price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public double totalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public String toString() {
        return super.toString() + " => Tổng giá sản phẩm: " + totalPrice();
    }
}
