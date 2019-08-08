package com.softserve.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee1 = new Employee();
        employee1.setName("Anatoly");
        employee1.setRate(62.50);
        employee1.setHours(40);

        Employee employee2 = new Employee("Viktor",80.00);
        employee2.setHours(38);

        Employee employee3 = new Employee("Volodymyr",95.00, 40);

        System.out.println("Numbers of created instanses \"Emlpoyee\": " + Employee.getCountObj() + '\n');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println();

        Employee [] e = {employee1, employee2, employee3};
        int tH = 0;
        for (Employee w : e) {
            tH = tH + w.getHours();
            Employee.setTotalHours(tH);}

        System.out.println("Employees have worked out: " + Employee.getTotalHours() + " hours");

    }
}
