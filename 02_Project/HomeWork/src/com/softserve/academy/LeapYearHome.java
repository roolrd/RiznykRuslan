package com.softserve.academy;

public class LeapYearHome {
    public static void main(String[] args) {

        int year = 1600;
        boolean isLeap;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
        { isLeap = true;
           // System.out.println(isLeap);
        }
        else {
                    isLeap = false;
           // System.out.println(isLeap);
        }
        System.out.println(isLeap);
    }
}
