package src.Basic_practice;

import java.util.Scanner;

public class Ex10 {

//Write a Java program and compute the sum of an integer's digits.
//
//Test Data:
//Input an intger: 25

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to input an integer
        System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();

        // Calculate and display the sum of the digits
        System.out.println("The sum of the digits is: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while  (n!=0){

            sum= (int) (sum+n%10);  // 64... 64%10= 4;  64/10= 6;  sum = 4+6%10 == 10

            n= n/10;

        }


        return sum;
    }
}
