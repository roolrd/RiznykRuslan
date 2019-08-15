package com.softserve.academy.Person;

public class Cleaner extends Staff {


    public Cleaner(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void salary() {
        System.out.println("I have " + getSalary() + " a day");
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner, my name is " + getName());
    }
}
