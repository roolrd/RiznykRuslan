package com.softserve.academy;

public class Triangle {
    public static void main(String[] args) {

        int n = 4;
        int noOfStars = 1;

        for (int rows = 1; rows <= n; rows++)
        {
            // line of stars
            for (int stCount = 1; stCount <= noOfStars; stCount++)
                System.out.print("*");

            // Next line
            System.out.println();

            noOfStars ++;
        }
    }
}
