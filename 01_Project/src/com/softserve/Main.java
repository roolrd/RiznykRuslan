package com.softserve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World!!!");

        int a, b, c, x;
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please, enter first number . . . ");
        a = myScan.nextInt();
        System.out.println("Please, enter second number . . . ");
        b = myScan.nextInt();
        c = a + b;
        System.out.println("a + b = " + c);
        c = a - b;
        System.out.println("a - b = " + c);
        c = a * b;
        System.out.println("a * b = " + c);
        c = a / b;
        System.out.println("a / b = " + c);

        System.out.println("How are you? ");
        String answer = myScan.next();
        //не реагує на nextLine, якщо включити попередній блок, а якщо закоментити тоді все добре
        System.out.println("Thanks, I am " + answer);


        System.out.println("Please, enter some more number . . . ");
        x = myScan.nextInt();
        int y = (int) Math.pow(x, 2);
        System.out.println("x" + '\u00B2' + " = " + y);
        double z = Math.sqrt(x);
        System.out.println('\u221A' + "x" +  " = " + z);

    }
}
