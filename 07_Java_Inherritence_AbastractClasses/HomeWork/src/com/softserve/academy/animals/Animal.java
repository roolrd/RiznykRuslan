package com.softserve.academy.animals;

abstract public class Animal {

    private String name;

    public Animal(){
        this.name=name;
    }

public Animal(String name){
    this.name=name;
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}

public abstract void feed();
public abstract void voice();

}
