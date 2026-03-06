package org.example;

public class Intern extends Employee{
    public void attendTraining(){
        System.out.println("Attended");
    }
    public void submitReport(){
        System.out.println("Submit reported ");
    }

    public Intern(int salary, int employeeID, String name) {
        super(salary, employeeID, name);
    }
}
