package com.softserve.academy;

import static java.lang.Math.*;

public class Three {
    public static void main(String[] args) {

        int n = 5, sum = 0, j = 0, k = 1;

     //   System.out.print("1");

        for (int i=1; i<=n; i++) {
            k = k + j;
            System.out.print(k);
            j = (int) pow(10, i);
            sum = sum + k;
            System.out.print(" + ");
        }
        System.out.println();
        System.out.println("The Sum is : " + sum);
    }
}
