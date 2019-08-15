package com.softserve.academy.Person;

public class Teacher extends Staff{


    public Teacher(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void salary() {
        System.out.println("I have " + getSalary() + " a day");

    }

    @Override
    public void print() {
        System.out.println("I am a Teacher, my name is " + getName());
    }
}
