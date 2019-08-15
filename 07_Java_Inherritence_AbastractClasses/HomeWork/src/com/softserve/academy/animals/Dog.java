package com.softserve.academy.animals;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("I like bones");
    }

    @Override
    public void voice() {
        System.out.println("I say \"bow\"...");
    }

    }
