package com.naresh.narendra.practice;

import java.util.Scanner;

public class WeightOfThreePersons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First person weight :");
        double w1 = sc.nextDouble();
        System.out.println("Enter the Second person weight :");
        double w2 = sc.nextDouble();
        System.out.println("Enter the Third person weight :");
        double w3 = sc.nextDouble();
        double sumOfWeights = w1+w2+w3;
        double avg_weights = sumOfWeights/3;
        System.out.println("The sum of weight of the 3 persons is " +sumOfWeights + " Kgs and the average weight is " + avg_weights + " Kgs");

    }
}
