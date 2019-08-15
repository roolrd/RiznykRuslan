package com.softserve.academy.Person;

public class Main {

    public static void main(String[] args) {

        Person[] peoples = {
                new Student("Alex"),
                new Teacher("Vira", 500),
                new Cleaner("Lola", 300)
        };

        for (Person p : peoples) {
            p.print();
            if (p instanceof Staff) {
                ((Staff)p).salary();
            }
        }
    }
}
