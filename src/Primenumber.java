package src;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {


        int n=13;  // 2 -------12  1,2 3 4 5 6 7 8 9

        boolean prime = true;

        for (int i=2; i<n;i++)
        {

            if(n%i==0){

                prime = false;
                System.out.println("No not a prime number "+ n);

                break;
            }

        }

        if (prime){

            System.out.println("Yes it is a prime number "+ n);
        }

    }

}