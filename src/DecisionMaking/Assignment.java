package src.DecisionMaking;

import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = scanner.nextInt();

        if(number%2==0){

          System.out.println("The number is even number");
        }
       else {

            System.out.println("The number is Odd number");

        }


    }
}
