package com.softserve.academy;

public class Employee {

    private String name;
    private String department;
    private double salary;
    private static int count;

    static { count=0;  }

    public Employee (String name, String department, double salary) {
        this.name=name;
        this.department=department;
        this.salary=salary;
        count++;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public int getCount(){
        return count;
    }


}
