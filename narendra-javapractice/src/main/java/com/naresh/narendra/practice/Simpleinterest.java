package com.naresh.narendra.practice;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the principal amount");
        double principalAmt=Sc.nextDouble();
        System.out.println("enter rate of interest");
        float rateofInst=Sc.nextFloat();
        System.out.println("enter time in years");
        float timeinY=Sc.nextFloat();
        double simpleInst=((principalAmt*rateofInst*timeinY/100));
        double simpleInstY=simpleInst*12;
        System.out.println("simple interest is " +simpleInst+ " per month ");
        System.out.println("simple interest " +simpleInstY+ " per year ");
    }

}
