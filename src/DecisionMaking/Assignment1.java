package src.DecisionMaking;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {


//    Write a program that calculates and displays the letter grade for a given numerical score(e.g., A, B, C, D or F) based on the following
//
//        A :90-100
//        B :80-89
//        C :70-79
//        D :60-69
//        F :0-59
//


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your score");


        int score = scanner.nextInt();

        if (score > 90 && score <= 100) {

            System.out.println("Your grade is A");

        } else if (score > 80 && score <= 89) {

            System.out.println("Your score is B");


        } else if (score > 70 && score <= 79) {


            System.out.println("your score is C");

        } else if (score > 60 && score <= 69) {

            System.out.println("Your score is D");

        } else {

            System.out.println("You got D failed");

        }


    }


}





