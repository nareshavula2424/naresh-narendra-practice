package com.naresh.narendra.practice;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main (String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the employee number");
        int empNo=Sc.nextInt();
        System.out.println("enter the employee name");
        String empName=Sc.next();
        System.out.println("enter monthly salary");
        double mSalary=Sc.nextDouble();
        double ySalary=mSalary*12;
        System.out.println("Hi "+empName+"! Your employee id is "+empNo+", monthly salary is Rs "+mSalary+" and yearly salary is Rs "+ySalary);
    }

}
