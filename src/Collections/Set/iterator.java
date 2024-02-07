package src.Collections.Set;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class iterator {

    public static void main(String[] args) {

      ArrayList <Integer> al = new ArrayList<>();

        al.add(23);
        al.add(5);
        al.add(67);
        al.add(44);

    Iterator<Integer> e=al.iterator();

//        while (e.hasNext()){
//
//
//
//        }
        e.next();
        e.next();
        e.remove();
        System.out.println(al);
    }
}
