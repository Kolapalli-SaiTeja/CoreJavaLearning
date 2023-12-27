package src.Basics;

import java.util.Scanner;

public class learning {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your number");

        // int number = scanner.nextInt();

          String round1candidateStatus ="fail";
        if (round1candidateStatus=="pass") {

            System.out.println("You have cleared round 1");

            String round2candidateStatus ="pass";

            if (round2candidateStatus =="pass"){


                System.out.println("you have cleared round 2");

                String round3candidateStatus ="pass";


                if (round3candidateStatus=="pass"){


                    System.out.println("you have passed round 3");


                }
                else {

                    System.out.println("you have failed round 3");
                }



            }
            else{

                System.out.println("you have failed round 2");

            }
        }
else {

            System.out.println("you have failed round 1");
        }



    }
    }