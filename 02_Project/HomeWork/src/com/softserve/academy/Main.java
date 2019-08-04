package com.softserve.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 3;
        int noOfSpaces = n-1;
        int noOfStars = 1;

        for (int rows = 1; rows <= n; rows++)
        {
            // Line of spaces
            for (int spCount = 1; spCount <= noOfSpaces; spCount++)
                System.out.print(" ");
            // line of stars
            for (int stCount = 1; stCount <= noOfStars; stCount++)
                System.out.print("*");
            // Next line
            System.out.println();
            noOfSpaces--; noOfStars +=2;
        }
    }
}
