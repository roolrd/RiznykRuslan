package com.softserve.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        int n;
        String evenOdd, posNeg;
        System.out.println("Set the value of variable \"m\" >> ");
        int m = sc.nextInt();

        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        }
        else {
            n = -1;
        }
        System.out.println("n = " + n);

        evenOdd = (m % 2 ==0) ? "m is even number" : "m is odd number";
        System.out.println(evenOdd);

        posNeg = (m < 0) ? "m is negative number" : "m is positive number";
        System.out.println(posNeg);
        sc.close();
    }
}
