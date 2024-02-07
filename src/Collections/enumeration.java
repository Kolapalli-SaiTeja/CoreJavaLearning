package src.Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class enumeration {
    public static void main(String[] args) {


        Vector <String> v = new Vector<>();

        v.add("Mango");
        v.add("Apple");
        v.add("Orange");
        v.add("Sapota");


       Enumeration<String> e= v.elements();

       while (e.hasMoreElements()){

           System.out.println(e.nextElement());
       }




        Hashtable<String,String> ht = new Hashtable<>();

        ht.put("Mango","monkey");
        ht.put("sapota","elephant");
        ht.put("straberry","deer");
        ht.put("apple","lion");

        Enumeration b= ht.elements();

        while (b.hasMoreElements()){

            System.out.println(b.nextElement());
        }


    }
}
