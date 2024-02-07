package src.Basic_practice;

import java.util.Scanner;

public class Ex15 {

    // Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    //Sample Output:
    //
    //Input the first number : 5
    //Input the second number: 10
    //Input the third number : 15
    //The result is: true
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter 1st number");

        int x = scr.nextInt();

        System.out.println("Enter 2nd number");

        int y = scr.nextInt();

        System.out.println("Enter 3rd number");

        int z = scr.nextInt();


        System.out.println( math(x,y,z));
    }

    public static boolean math(int  x, int y,int z) {


        return ((x + y) == z || (y + z) == x || (z + x) == y);
    }
}