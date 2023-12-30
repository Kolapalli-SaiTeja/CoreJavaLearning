package src.DecisionMaking;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day");

        String day = scanner.nextLine();


        if (day.equals("monday") || (day.equals("tuesday")) || (day.equals("wednesday")) || (day.equals("thursday")) || day.equals("friday"))

        {

            System.out.println("uff, its a weekday");
        }
else
    if (day.equals("saturday") || (day.equals("sunday")))
        {
            System.out.println("hurray!!! its a weekend");
        }
else {

            System.out.println("Fool!! enter the correct day");

        }






//        if (day.equals( "saturday")  || (day.equals("sunday")) ){
//
//            System.out.println("uff, its a weekend");
//
//
//        }
//        else{
//            System.out.println("weekday");

    }
}
