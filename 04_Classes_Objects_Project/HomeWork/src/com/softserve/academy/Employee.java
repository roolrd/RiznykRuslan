package com.softserve.academy;

public class Employee {

    private String name;
    private double rate;
    private int hours;
    private static int totalHours;
    private static int countObj;

    static {countObj=0;}

      public   Employee() {
        countObj++;}

   public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        countObj++;}

   public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        countObj++;}

    public void setName(String name) {
        this.name = name;}
    public String getName() {
        return name;}

    public void setRate(double rate) {
        this.rate = rate;}
    public double getRate() {
        return rate;}

    public void setHours(int hours){
        this.hours=hours;}
    public int getHours(){
        return hours;}

    public static int getCountObj() {
        return countObj;}

    public static void setTotalHours(int totalHours) {
        Employee.totalHours = totalHours;}

    public static int getTotalHours() {
        return totalHours;
    }

    public double sallary(int hours, double rate) {
        double emplSallary = hours * rate;
        return emplSallary;}

    public void changeRate(double newRate) {}

    public double bonuses() {
        double bonus = rate * 0.3;
        return bonus;}

    @Override
    public String toString() {
        return "Employee [Name = "
                + name + ", rate = " + rate + ", hours= " + hours + "]";}

    }

