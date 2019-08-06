package com.softserve.academy;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.setName("Andy");
        person1.setBirthYear(2019);
        person1.info();
        int numOfObj = Person.count;
        System.out.println("We have created: " + numOfObj + " Person's objects");
    }
}
