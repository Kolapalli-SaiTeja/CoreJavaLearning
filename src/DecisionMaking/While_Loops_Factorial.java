package src.DecisionMaking;

import java.util.Scanner;

public class While_Loops_Factorial {


    //factorial means  5!= 5x4x3x2x1;


    public static void main(String[] args) {

        Scanner scr =new Scanner(System.in);
        System.out.println("Enter the value of number");

        int number = scr.nextInt();


        long fact =1;

        int i = 1;

        while (i<=number){

          fact = fact*i ;  // 1 x i(1) =1; 1x i(2)=2;..............

            i++;

        }

        System.out.println(fact);



    }
}
