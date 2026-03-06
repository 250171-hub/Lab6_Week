package org.example;

public class Clothing extends  Product{
    private int size;
    private String color;

    public Clothing(String name, int price, int productID, int size, String color) {
        super(name, price, productID);
        this.size = size;
        this.color = color;
    }

    public void checkSizeAvailability(){
        System.out.println("This size is available");
    }
}
