package src.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class list_Prac {

    public static void main(String[] args) {


        List cars = new ArrayList();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("benz");
        cars.add("creta");
        cars.add("ertiga");

       Collections.sort(cars);



        Iterator iterator = cars.iterator();

        while (iterator.hasNext())
        {

            System.out.println(iterator.next());
        }


        System.out.println(iterator);




//        for (Object o : cars) {
//
//            System.out.println(o);
//
//        }


//        System.out.println(fruits);


    }
}