package src.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class list_iterator {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();


        al.add(90);
        al.add(99);
        al.add(40);


        ListIterator <Integer> li = al.listIterator();


//        while (li.hasNext()){
//
//            System.out.println(li.next());
//
//        }
//        li.add(100);
//
//        System.out.println(al);
//
//        System.out.println("  ");

        while (li.hasNext()){

            System.out.println(li.next());
        }
    }
}
