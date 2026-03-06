package org.example;

public class Developer extends Employee{
    public void writeCode(){
        System.out.println("Writed code");
    }
    public void fixBug(){
        System.out.println("Fixed bug");
    }

    public Developer(int salary, int employeeID, String name) {
        super(salary, employeeID, name);
    }
}
