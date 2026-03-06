package org.example;

public class Book extends Product{
    private String author;
    private int ISBN;

    public Book(String name, int price, int productID, String author, int ISBN) {
        super(name, price, productID);
        this.author = author;
        this.ISBN = ISBN;
    }
}
