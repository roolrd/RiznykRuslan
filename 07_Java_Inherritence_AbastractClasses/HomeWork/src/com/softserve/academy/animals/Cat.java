package com.softserve.academy.animals;

public class Cat extends Animal {

    public Cat (){
        super();
    }
    public Cat (String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("I like milk");
    }

    @Override
    public void voice() {
        System.out.println("I say \"miu\"...");
    }
}
