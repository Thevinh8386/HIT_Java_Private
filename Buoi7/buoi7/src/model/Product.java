package model;

public abstract class Product {
    protected String id;
    protected String name;
    protected float price;
    protected int quantity;
    public abstract double totalPrice();

    //Constructor
    public Product(){}

    public Product(String id, String name, float price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Getters method
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //Setters method

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "PRODUCT {" +
                "ID: '" + id + '\'' +
                ", Name: '" + name + '\'' +
                ", Price:  " + price +
                ", Quantity = " + quantity +
                '}';
    }
}
