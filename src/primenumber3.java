package src;

import java.util.Scanner;

public class primenumber3 {

    public static void main(String[] args) {


         Scanner scr = new Scanner(System.in);

        System.out.println("Enter the value to check it is prime or not");

         int number = scr.nextInt();

       // int n =3; //1 234678 9

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

               isPrime =false;

                System.out.println("Not a prime number");
                break;

            }

        }

        if (number <= 1) {

            System.out.println("1 is not a prime number");

        } else if (isPrime) {

            System.out.println("It is a prime number");

        }




        }

    }



