package src.Arrays;

import java.util.Scanner;

public class AInsertion_10 {
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        int[] arr = new int[5];


        System.out.println("Enter the array elements");

        for (int i =0;i<arr.length-1; i++)
        {

            arr[i]= scr.nextInt();

        }

        System.out.println("Your original Array elements are");

        for(int b : arr)
        {
            System.out.println(b);

        }

        System.out.println("Enter the location where you want to insert");

        int Location=scr.nextInt();

        System.out.println("Enter the value you want to insert");

        int value = scr.nextInt();

        System.out.println(" ");

        for(int i =arr.length-1; i>Location;i--)
        {
            arr[i] = arr[i-1]; // here we are moving elements to next one  { 10, 20, 30, 40,0}
                               // 40>0, 30>40, 20>30  { 10, 20, 30,40}


        }



       arr[Location] =value;

        System.out.println("After insertion your values are");

        for( int i : arr)
        {
            System.out.println(i);

        }
    }
}
