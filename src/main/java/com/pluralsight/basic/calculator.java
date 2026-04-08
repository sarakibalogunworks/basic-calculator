package com.pluralsight.basic;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = myscanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = myscanner.nextInt();
        myscanner.nextLine();

        int result = firstNumber * secondNumber;


        System.out.println(firstNumber + " * " + secondNumber + " = " + result);


    }
}
