package com.softserve.academy.Person;

public class Student extends Person {

    public Student(String name){
        super(name);
    }

    public void print(){
        System.out.println("I am a Student, my name is " + getName());
    }
}
