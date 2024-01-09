package src.Arrays;

import java.util.Scanner;


public class Arrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks of 10th");
        int marks[]=new int[6];
        System.out.println("Enter your 1st value");
        marks[0]=sc.nextInt();
        System.out.println("Enter your second value");
        marks[1]=sc.nextInt();
        System.out.println("Enter your third value");
        marks[2]=sc.nextInt();
        System.out.println("Enter your fourth value");
        marks[3]=sc.nextInt();
        System.out.println("Enter your fifth value");
        marks[4]=sc.nextInt();
        System.out.println("Enter your sixth value");
        marks[5]=sc.nextInt();
        String sub[]={"Hindi","eng","math","physics","chemistry"};
        for(int i= 0; i<marks.length && i< sub.length;i++)
        {
            System.out.println(sub[i]+" "+ "marks  "+marks[i]);
        }
    }
}








