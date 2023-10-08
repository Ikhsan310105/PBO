package com.ikhsan.employeetest;

class Employee{

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireyear;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", Hire Year: " + hireYear();
    }

    private String name;
    public double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
}
