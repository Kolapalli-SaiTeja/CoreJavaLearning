package src.Collections;

import java.util.Vector;

public class Vector_Prac2 {
    public static void main(String[] args) {



        Vector v1 = new Vector();

        v1.add("rama");
        v1.add("hanuma");
        v1.add("lakshman");
        v1.add("sugriva");
        v1.add(3);
        v1.add(5);





        for(Object store : v1){



            System.out.println(store);
        }


        Vector <Boolean> v2 = new Vector<>();

        v2.add(true);

        Vector <Double> v3 = new Vector<>();

        v3.add(232.4);

        Vector <Float> v4 = new Vector<>();
        v4.add(34324324234324324324324324324324323.23223232323232323f);

        System.out.println(v4);
        System.out.println(v3);
        System.out.println(v2);
        System.out.println(v1);

    }




}
