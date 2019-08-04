package com.softserve.academy;
import java.util.Scanner;
public class First10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int  sum = 0, prod = 1, i= 1;

        // як зробити перевірку чи введено ціле число
                    do {
                System.out.println("Enter " + i + "-th number >>");
                int number = 0;

                while (true) {
                    String m = sc.nextLine();
                    try {
                        number = Integer.parseInt(m);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Введіть число повторно:");
                        m = sc.nextLine();
                    }
                }



                if (m > 0) {
                    sum += m;
                    prod *= m;
                    i++;
                } else {
                    System.out.println("Enter positive (natural) number...");
                }

            } while (i <= 10);
            System.out.println("sum = " + sum + " and product = " + prod);
            sc.close();
        }

    }
