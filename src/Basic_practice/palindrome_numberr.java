package src.Basic_practice;

import java.util.Scanner;

public class palindrome_numberr {
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);


        int num=scr.nextInt();

        int rev = 0;

        int org_num= num;


        while (num!=0){

            rev = rev*10 + num%10;

            num = num/10;

        }

        System.out.println(rev);

        if(org_num==rev){

            System.out.println("The number is a palindrome");

        }else {

            System.out.println("The number is not a palindrome");
        }

    }
}
