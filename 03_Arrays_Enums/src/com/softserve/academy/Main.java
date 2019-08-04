package com.softserve.academy;

import java.util.Scanner;

public class Main {

   public enum Continent { Eurasia, Africa, NorthAmerica, SouthAmerica, Australia, Antarctica}

    public static void main(String[] args) {
	// write your code here
        Continent continent = Continent.Antarctica;
        switch (continent) {
            case Africa:
                System.out.println("Egypt, " + "Nigeria, " + "South Africa");
                break;
            case Eurasia:
                System.out.println("Ukraine, " + "Un.Kingdom, " + "China");
                break;
            case NorthAmerica:
                System.out.println("U.S.A., " + "Canada, " + "Mexico");
                break;
            case SouthAmerica:
                System.out.println("Brazil, " + "Argentina, " + "Chili");
                break;
            case Australia:
                System.out.println("Australia");
                break;
            case Antarctica:
                System.out.println("No countries ...");
        }
    }
}