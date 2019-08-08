package com.softserve.academy;

public class Employee {

    private String name;
    private String department;
    private double salary;
    private static int count=0;

    Employee (String name, String department, double salary) {
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.count++;
    }
}
