package src.Arrays;

public class Array4 {

    public static void main(String[] args) {

        //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."




        // 3 x1 = 3
        //  3x 2 = 6


        for(int i =1; i<=100; i++){

           // System.out.println(i);

            if(i%3==0 && i%5==0){

                System.out.println("FizzBuzz ");

            } else if (i%3==0) {

                System.out.println("Fizz ");

            } else if (i%5==0) {

                System.out.println("buzz ");

            }else

                System.out.println(i);


        }







    }
}
