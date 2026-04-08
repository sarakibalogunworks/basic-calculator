package com.pluralsight.basic;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //Exercise 3

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = myscanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = myscanner.nextInt();
        myscanner.nextLine();

        System.out.println("\nPossible calculation:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option: ");

        int result = firstNumber * secondNumber;


        System.out.println(firstNumber + " * " + secondNumber + " = " + result);


    }
}
