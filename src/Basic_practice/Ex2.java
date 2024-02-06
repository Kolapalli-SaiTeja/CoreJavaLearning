package src.Basic_practice;

import java.util.Scanner;

public class Ex2 {


    // Write a Java program to print the sum of two numbers.
    // Test data 74 +36
    public static void main(String[] args) {

        int sum ;
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the two numbers you want to sum");

        System.out.println("Enter the first number");
      int a=  scr.nextInt();

        System.out.println("Enter the second number");
       int b= scr.nextInt();

       sum=a+b;

        System.out.println("The sum of two numbers is " + a + " & "+ b +" is "+ sum);


    }
}
