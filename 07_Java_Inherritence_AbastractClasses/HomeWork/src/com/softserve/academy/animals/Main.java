package com.softserve.academy.animals;

public class Main {

    public static void main(String[] args) {
        Animal [] animals  = {
                new Cat("Murchyk"),
                new Dog("Leila"),
                new Cat("Marsik"),
                new Dog("Tuzik")};

        for (Animal animal :  animals){
            System.out.println("I am a " + animal.getClass().getName() + ", my name is " + animal.getName());
            animal.feed();
            animal.voice();
        }
    }
}
