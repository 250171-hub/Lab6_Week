package org.example;

public class Employee {
    protected String name;

    protected int employeeID;

    protected int salary;

    public Employee(int salary, int employeeID, String name) {
        this.employeeID = employeeID;
        this.salary = salary;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println(name + employeeID + salary);
    }
}
