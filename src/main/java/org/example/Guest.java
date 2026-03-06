package org.example;

public class Guest extends Person {
    Librarian librarian = new Librarian("AA", 231 , 32);

    public void viewCatalog(){
        System.out.println("You are entering catalog " + librarian.books);
    }

    public Guest(String name, int ID, int age) {
        super(name, ID, age);
    }
}
