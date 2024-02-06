package src.Basic_practice;

import java.util.Scanner;

public class Ex3 {

    //Write a Java program to divide two numbers and print them on the screen.
    //Test Data :
    //50/3


    public static void main(String[] args) {

        int result ;
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the two numbers you want to divide");



        System.out.println("Enter the first number");
        int a=  scr.nextInt();

        System.out.println("Enter the second number");
        int b= scr.nextInt();

        result= a/b;

        System.out.println("The division of two numbers is " + a + " & "+ b +" is "+ result);

    }
}
