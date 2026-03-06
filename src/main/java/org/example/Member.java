package org.example;

public class Member extends Person{
    public void borrowBook(){
        System.out.println("Borrowed book");
    }
    public void returnBook(){
        System.out.println("Returned book");
    }
    public void viewBorrowedBooks(){
        System.out.println("Returned book is: ");
    }
    public Member(String name, int ID, int age) {
        super(name, ID, age);
    }
}
