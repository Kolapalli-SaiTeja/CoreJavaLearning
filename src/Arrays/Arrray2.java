package src.Arrays;

import java.util.Scanner;

public class Arrray2 {


    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter the 1st subject marks");
         marks[0] =  scr.nextInt();
        System.out.println("Enter the 2nd subject marks");
        marks[1] =  scr.nextInt();
        System.out.println("Enter the 3rd subject marks");
        marks[2] =  scr.nextInt();
        System.out.println("Enter the 4th subject marks");
        marks[3] =  scr.nextInt();
        System.out.println("Enter the 5th subject marks");
        marks[4] =  scr.nextInt();


        int sum  = 0;


        for (int i =0; i<marks.length;i++){

           // System.out.println(marks[i]);

            System.out.println(sum+marks[i]);  // 0+1=1;// 1+2=3; 3=3+3

            System.out.println(sum);



        }



    }


}
