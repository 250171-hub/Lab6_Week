package org.example;

public class Electronics extends Product{
    protected int warranty;
    protected String brand;

    public Electronics(String name, int price, int productID, int warranty, String brand) {
        super(name, price, productID);
        this.warranty = warranty;
        this.brand = brand;
    }

    public int getWarranty() {
        return warranty;
    }
}
