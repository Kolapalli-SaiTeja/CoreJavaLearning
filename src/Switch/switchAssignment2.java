package src.Switch;

import java.util.Scanner;

public class switchAssignment2 {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");

        String day = scanner.nextLine();

        switch (day){


            case "monday","tuesday","wednesday","thursday","friday" :

                System.out.println("oops!!!! its a weekday");

                break;


            case "saturday", "sunday" :

                System.out.println("hurray!!!! its a weekend");

                break;

            default:

                System.out.println("enter a correct day");



        }


    }
}
