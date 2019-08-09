package com.softserve.academy;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Employee e1 = new Employee("Viktor", "main", 15300.00);
        Employee e2 = new Employee("NatalyO", "second", 15500.00);
        Employee e3 = new Employee("Oksana", "second", 14000.00);
        Employee e4 = new Employee("Oksana", "second", 14000.00);
        Employee e5 = new Employee("NatalyZ", "third", 15600.00);

        Employee[] ArrEmpl = {e1, e2, e3, e4, e5};

        double max = ArrEmpl[0].getSalary();
        int imax = 0, i = 0;
        for (Employee p : ArrEmpl) {
            if (p.getSalary() > max) {
                max = p.getSalary();
                imax = i;
            }
            i++;
        }
        System.out.println(ArrEmpl[imax].getName() + " has the highest salary");

        double min = ArrEmpl[0].getSalary();
        int jmin = 0, j = 0;
        while (j < ArrEmpl.length) {
            if (ArrEmpl[j].getSalary() < min) {
                min = ArrEmpl[j].getSalary();
                jmin = j;
            }
            j++;
        }
        System.out.println(ArrEmpl[jmin].getName() + " has the lowest wage");
        System.out.println();

        Arrays.sort(ArrEmpl);
        for (Employee s : ArrEmpl) {
            System.out.println(s);
        }
        System.out.println();

        Arrays.sort(ArrEmpl, Collections.reverseOrder());
        for (Employee e : ArrEmpl) {
            System.out.println(e);
        }

        Employee[] identical = new Employee[ArrEmpl.length];
        int ind = 0;
        for (int a = ArrEmpl.length - 1; a > 0; a--) {
            if (ArrEmpl[a].equals(ArrEmpl[a - 1])) {
                identical[a] = ArrEmpl[a];
                identical[a - 1] = ArrEmpl[a - 1];
                ind = 1;
            }
        }
        if (ind != 0) {
            System.out.println();
            System.out.println("There are such identical Employees: ");

            for (Employee d : identical) {
                if (d != null) {
                    System.out.println(d);
                }
            }
        } else {
            System.out.println();
            System.out.println("There are no identical Employees");

        }
    }
}








