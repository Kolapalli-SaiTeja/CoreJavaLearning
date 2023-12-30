package src.Switch;

import java.util.Scanner;


public class switch1 {


    public static void main(String[] args) {

        System.out.println("Enter the number A, B ");
        Scanner scr =new Scanner(System.in);


        int A = scr.nextInt();
        int B = scr.nextInt();
        char op = scr.next().charAt(0);



       switch (op){


           case '+' :

               System.out.println("you have done addition"+ "\n" + (A+B));


              break;

           case '-' :

               System.out.println("you have done subtraction" + "\n" + (A-B));

               break;

           case '%' :

               System.out.println("you have done divison remainder is output" + "\n" + (A%B));

               break;

           case '/' :

               System.out.println("you have done divison, quotient is answer" + "\n" + (A/B));

               break;

           case '*' :

               System.out.println("you have done multiplication" + "\n" + (A*B));

               break;

           default:

               System.out.println("noob enter correct symbol");


       }
    }
}



