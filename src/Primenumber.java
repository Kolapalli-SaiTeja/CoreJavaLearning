package src;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {


        int n=9;  // 2 -------12  1,2 3 4 5 6 7 8 9

        boolean prime = true;

        for (int i=2; i<n;i++)
        {

            if(n%2==0){

                prime = false;

                break;
            }

        }

        System.out.println(prime);

    }

}