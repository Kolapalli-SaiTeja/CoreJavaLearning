package src.Basic_practice;

import java.util.Scanner;

public class Palindome_String {

    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the name you want to reverse");
        String name = scr.nextLine();

        String org_name = name;


        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);

        }

        System.out.println(rev);


        if(rev.equals(name)){

            System.out.println("the string is a palindrome");

        }else {

            System.out.println("not a palindrome");
        }

    }




}
