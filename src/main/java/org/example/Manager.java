package org.example;

public class Manager  extends  Employee{
    public Manager(int salary, int employeeID, String name) {
        super(salary, employeeID, name);
    }

    public void assignTask(){
        System.out.println("You have been assigned a task");
    }
    public void approveLeave(){
        System.out.println("You are permitted to leave");
    }
}
