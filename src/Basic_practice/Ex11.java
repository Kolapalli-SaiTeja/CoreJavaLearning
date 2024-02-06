package src.Basic_practice;

import java.util.Scanner;

public class Ex11 {

    //Write a Java program to reverse a string.
    //Input Data:
    //Input a string: The quick brown fox
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        char [] word = scr.nextLine().toCharArray();

        for (int i=word.length-1; i>=0;i--)
        {

            System.out.println(word[i]);


        }


    }
}
