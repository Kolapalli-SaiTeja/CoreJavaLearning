package src.Strings;

import java.util.Scanner;

public class String_Practice5 {

//Write a java program to remove all starting and ending spaces from a string
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the text");

        String text = scr.nextLine();

        System.out.println(text.trim());

    }

}
