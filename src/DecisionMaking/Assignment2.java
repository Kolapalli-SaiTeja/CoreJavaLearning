package src.DecisionMaking;

import java.util.Scanner;
public class Assignment2 {

    public static void main(String[] args) {
        
        
//        If all the sides are equal for the triangle (Equilateral)
//        if only two sides are equal then its (Isosceles)
//        if no sides are equal then its Scalene

        System.out.println("Enter the side1,side2,side3");

        Scanner scanner = new Scanner(System.in);
        
        int side1 =scanner.nextInt();
        int side2 =scanner.nextInt();
        int side3 = scanner.nextInt();
        
        if(side1==side2 && (side2==side3)&&(side3==side1)){

            System.out.println("its Equilateral");
            
        } else if (side1==side2 ||side2==side3 ||side3==side1) {

            System.out.println("its Isosceles");
            
        } else{

            System.out.println("scalene");
        }

    }
    }