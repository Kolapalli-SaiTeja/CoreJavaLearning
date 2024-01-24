package src.Arrays;

import java.util.Scanner;

public class Array_Deletion_Prac {

    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the Array values");

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = scr.nextInt();   // 10, 20 ,30 , 40

        }


        System.out.println("Location where u want to deletion");

        int Location = scr.nextInt();

        System.out.println("  ");

        for (int i = Location; i < arr.length - 1; i++) {

            arr[i] = arr[i+1];

        }

        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}