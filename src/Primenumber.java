package src;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {


        int n=13;  // 2 -------12

        boolean prime = true;

        for (int i=2; i<13;i++)
        {

            if(n%2==0){

                prime = false;

                break;
            }

        }

        System.out.println(prime);

    }

}