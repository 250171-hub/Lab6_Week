package org.example;

import java.util.ArrayList;

public class Librarian extends Person{
    public Librarian(String name, int ID, int age){
        super(name, ID, age);
    }
    ArrayList<String> books = new ArrayList<>();

    public void addBook(String book){
        books.add(book);

    }
    public void removeBook(String book){
        books.remove(book);

    }
    public void issueBook(){
        System.out.println("The book have been issued");

    }
}
