package com.softserve.academy;

public class LeapYear {
    public static void main(String[] args) {

        int year = 0000;
        boolean isLeap;

        if (year % 4 != 0)
        { isLeap = false; }
        else {if (year % 100 != 0) {
            isLeap = true; }
            else {
            if (year % 400 == 0) {
                isLeap = true; }
            else {
                isLeap = false; }
        }
        }
        System.out.println(isLeap);
    }
}
