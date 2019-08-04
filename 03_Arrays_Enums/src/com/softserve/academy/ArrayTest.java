package com.softserve.academy;

public class ArrayTest {
    public static void main(String[] args) {

        int [] arrAy = {60, 1, -8, 4, -65, 15, -1, 51, -7, 9};

        int max = arrAy[0];
        for (int i=0; i<arrAy.length; i++) {
            if (arrAy[i] > max) {
                max = arrAy[i];
            }
        }
        System.out.println("Biggest number is: " + max);

       int sumOfPositive = 0; int j=0;
       while (j<arrAy.length) {
           if (arrAy[j] > 0) {
               sumOfPositive = sumOfPositive + arrAy[j];
           }
           j++;
       }
        System.out.println("Sum of positive numbers in the array: " + sumOfPositive);

        int amountOfPositive = 0, amountOfNegative = 0;
        for (int count: arrAy) {
            if (count>0) {
                amountOfPositive++;
            } else if (count<0) {
                amountOfNegative++;
            }
        }
        System.out.println("Amount of positive numbers - " + amountOfPositive + " and amount of negative numbers - " + amountOfNegative);
    }
}