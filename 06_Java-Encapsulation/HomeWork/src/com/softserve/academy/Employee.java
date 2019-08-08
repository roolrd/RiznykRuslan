package com.softserve.academy;

public class Employee implements Comparable<Employee> {

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

        public String toString(){
        return "Employee {Name: " + getName() + ", department: " + getDepartment() + ", salary: " + getSalary() + "}";
        }

        public boolean equals(Object obj){
        if (obj == null) return false;
        if (this == obj) return true;
        Employee other = (Employee) obj;
        if (name.equals(other.name) && department.equals(other.department) && salary == other.salary ) {
            return true;}
            return false;
            }

    public int compareTo(Employee other) {
        if(this.getSalary() > other.getSalary())
            return 1;
        else if (this.getSalary() == other.getSalary())
            return 0 ;
        return -1 ; }

       }
