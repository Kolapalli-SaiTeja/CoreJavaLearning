package src.Basic_practice;

public class Ex8 {

    //Write a Java program to print the area and perimeter of a circle.
    //Test Data:
    //Radius = 7.5



    //Expected Output
    //Perimeter is = 47.12388980384689
    //Area is = 176.71458676442586
 // Circumference of a circle is  2x pi(ii) xr


    public static void main(String[] args) {

        //A = pi r^2


        double radius = 7.5;

       double Result = Math.PI*7.5*7.5;


        System.out.println("Area of a Circle is "+Result);


        //Circumference of a circle is  2x pi(ii) xr

        double C = 2 *Math.PI *7.5;

        System.out.println("Cirumference of a circle is " + C);


    }
}
