package src.Basic_practice;

import java.util.Scanner;

public class Ex5 {

    //Write a Java program that takes two numbers as input and displays the product of two numbers.
    //Test Data:
    //Input first number: 25
    //Input second number: 5
    //Expected Output :
    //25 x 5 = 125


    public static void main(String[] args) {

        int result ;
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the two numbers you want to multiply");

        System.out.println("Enter the first number");
        int a=  scr.nextInt();

        System.out.println("Enter the second number");
        int b= scr.nextInt();

        result=a*b;

        System.out.println("The multiplication of two numbers is " + a + " & "+ b +" is "+ result);



    }
}
