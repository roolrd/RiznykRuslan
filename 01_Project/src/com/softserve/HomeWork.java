package com.softserve;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        double radius;
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please, enter radius of flower bed (in meters) . . . ");
        radius = myScan.nextDouble();
        double perimetr = Math.PI * 2 * radius;
        System.out.printf("Perimetr of the flower bed is %.2f", perimetr);
        System.out.println(" m");
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of the flower bed is %.2f", area);
        System.out.println(" m" + '\u00B2');

        System.out.print("What is your name? >> ");
        String name = myScan.next();
        System.out.print("How old are you? >> ");
        String age = myScan.next();
        System.out.print("Your name is " + name + " and you are " + age);
        }

    }
