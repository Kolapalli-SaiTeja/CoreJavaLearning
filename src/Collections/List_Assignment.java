package src.Collections;

import java.util.ArrayList;

public class List_Assignment {
    public static void main(String[] args) {

        // 4, 5, 0, 9, 8, 10 // sum and average of elements
        // sum of even numbers


        ArrayList <Integer> A1 = new ArrayList<>();

        A1. add(4);
        A1. add(5);
        A1. add(0);
        A1. add(9);
        A1. add(8);
        A1. add(10);


        int sum =0;


        int i=0;


        while(i<A1.size()){


            sum += A1.get(i);

            i++;
        }

        System.out.println(sum);
        System.out.println(sum/6);


        System.out.println("$$$$$$$$$$");
       // 4, 5, 0, 9, 8, 10 // sum of even  numbers in the list


        ArrayList <Integer> A2 = new ArrayList<>();

        A2. add(4);
        A2. add(5);
        A2. add(0);
        A2. add(9);
        A2. add(8);
        A2. add(10);


        int add = 0;

        for( int k =0; k<A2.size(); k++ ){


           int result = A2.get(k);

           if (result%2==0){

               add+= A2.get(k);
           }

        }





        System.out.println(add);









    }
}
