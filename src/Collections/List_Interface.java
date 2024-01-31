package src.Collections;

import java.util.List;

public class List_Interface {

    public static void main(String[] args) {


        List fruits = List.of("rama", "sita", 25, true, false, 45.4);

        fruits.add("kira");


        System.out.println(fruits);

        fruits.add(23);

        System.out.println(fruits);




    }
}
