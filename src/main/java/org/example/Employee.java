package org.example;

public class Employee {
    private String name;

    private int employeeID;

    private int salary;

    public Employee(int salary, int employeeID, String name) {
        this.employeeID = employeeID;
        this.salary = salary;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println(name + employeeID + salary);
    }
}
