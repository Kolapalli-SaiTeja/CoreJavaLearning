package src.Basic_practice;

public class Ex6 {


    // Write a Java program that takes a number as input and prints its multiplication table up to 10.
    //Test Data:
    //Input a number: 8
    //Expected Output :
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 3 = 24
    //...
    //8 x 10 = 80
    public static void main(String[] args) {

        int a =8;

        for (int i =1; i<=10; i++)
        {

            int result =  a * i ;

            System.out.println(a + " x "+ i + " = "+ result);

        }


    }
}
