package src.Arrays;

import java.util.Scanner;

public class Array_input_prac2 {

    public static void main(String[] args) {

        int n;
        int[] arr = new int[5];

//        arr[0] = 12;
//        arr[1] = 2;
//        arr[2] = 4;
//        arr[3] = 5;
//        arr[4] = 6;


        Scanner scr = new Scanner(System.in);

       System.out.println("Enter the size of elements you want to store");

      n = scr.nextInt();


        // Here the size can also be mentioned with arr.length

        System.out.println("Enter the Array elements");

        for (int i = 0; i < n; i++) {

            arr[i] = scr.nextInt();


        }

        System.out.println("Your Array elements are");
        for (int i = 0; i < n; i++) {


            System.out.println(arr[i]);
        }


    }

}
