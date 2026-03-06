package org.example;

public class Product {
    protected int productID;
    protected String name;
    protected int price;

    public Product(String name, int price, int productID) {
        this.price = price;
        this.name = name;
        this.productID = productID;
    }

    public void displayProductDetails(){
        System.out.println(productID + name + price);
    }
}
