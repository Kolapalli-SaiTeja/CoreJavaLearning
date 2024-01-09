package src.Static_And_NonStatic;

import java.util.Random;

public class NS2 {


   static int b = 20;


    public static void main(String[] args) {


        NS2 obj = new NS2();


        obj.b = 12;



        NS2 obj1 = new NS2();


        obj1.b = 13;


        NS2 obj2 = new NS2();


        obj2.b = 14;

        System.out.println(obj.b);
        System.out.println(obj1.b);
        System.out.println(obj2.b);



    }

}
