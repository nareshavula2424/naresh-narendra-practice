package com.naresh.narendra.practice;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value : ");
        int a = sc.nextInt();
        System.out.println("Enter the b value : ");
        int b = sc.nextInt();

        MathOperations mathOperations = new MathOperations();
        int res = mathOperations.sumOfTwoNumbers(a,b);
        int res1 = mathOperations.multiplicationOfTwoNumbers(a,b);
        System.out.println("The sum of two numbers " +res);
        System.out.println("The multiplication of two numbers " +res1);
    }
}
