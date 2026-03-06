package org.example;

public class Person {
   protected String name;
   protected int ID;
   protected int age;

    public void displayInfo(){
        System.out.println(name + ID + age );
    }

    public Person(String name, int ID, int age) {
        this.name = name;
        this.ID= ID;
        this.age = age;
    }

}
