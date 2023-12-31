package src;

import java.util.Scanner;

public class primenumber3 {

    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the value to check it is prime or not");

        int number = scr.nextInt();

        //int n = 9; //1 234678 9

        boolean isPrime = true;

        for (int i = 2; i<=number/2; i++)
        {
            if(number%i==0) {

                isPrime = false;
                break;

            }


            }

        System.out.println(isPrime);



        }


    }
