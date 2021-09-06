/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for first number to be inputted
        System.out.println( "What is the first number?" );
        //first double will be inputted and stored as "firstNum"
        double firstNum = scanner.nextDouble();

        //print statement asking for second number to be inputted
        System.out.println( "What is the second number?" );
        //second double will be inputted and stored as "secondNum"
        double secondNum = scanner.nextDouble();

        //print input numbers and output of +, -, *, and / them together
        System.out.format("%.2f + %.2f = %.2f\n", firstNum, secondNum, firstNum + secondNum);
        System.out.format("%.2f - %.2f = %.2f\n", firstNum, secondNum, firstNum - secondNum);
        System.out.format("%.2f * %.2f = %.2f\n", firstNum, secondNum, firstNum * secondNum);
        System.out.format("%.2f / %.2f = %.2f\n", firstNum, secondNum, firstNum / secondNum);

    }
}