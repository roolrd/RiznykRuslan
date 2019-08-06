package com.softserve.academy;

import java.time.LocalDate;

public class Person {

    LocalDate date = LocalDate.now();
    public static int count = 0;
    private String name;
    private int birthYear;

    public Person(){
        count++;
            }
    public Person(String name,int birthYear) {
        this.name=name;
        this.birthYear=birthYear;
        count++;
    }

        public void setBirthYear (int birthYear) {
            this.birthYear=birthYear;
        }
        public int getBirthYear(int i){
            return birthYear;
        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

        public int currAge () {
        int calcAge = date.getYear() - birthYear;

        return calcAge;
   }

        public void info () {
            if (currAge() < 0) {
                System.out.println("Please, enter correct value of birthYear");
            } else if (currAge() == 0) {
                System.out.println("The " + name + " is less then one year");
            } else {
                System.out.println("Person's name: " + name + " and he/she is " + currAge());
            }
        }
}
