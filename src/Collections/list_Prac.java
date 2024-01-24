package src.Collections;

import java.util.ArrayList;
import java.util.Collections;
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




        for (Object o : cars) {

            System.out.println(o);

        }


//        System.out.println(fruits);


    }
}