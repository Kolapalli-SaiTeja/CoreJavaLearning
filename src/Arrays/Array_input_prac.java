package src.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_input_prac {

    public static void main(String[] args) {

        int n;


        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the elements you want to store in an Array");

        n= scr.nextInt();

        int[] x = new int[10];

        System.out.println("Enter the elements of an array");


//        x[0] = scanner.nextInt();
//        x[1] = scanner.nextInt();
//        x[2] = scanner.nextInt();
//        x[3] = scanner.nextInt();
//        x[4] = scanner.nextInt();
//
//        System.out.println(Arrays.toString(x));


        for(int i=0;i<n;i++){

          x[i]=scr.nextInt();


        }
        System.out.println("The elements are ");

        for (int i=0;i<n;i++ ){


            System.out.println(x[i]);
        }




    }
}
