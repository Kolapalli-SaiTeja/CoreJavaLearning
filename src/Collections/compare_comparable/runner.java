package src.Collections.compare_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class runner {


    public static void main(String[] args) {


        Laptop details = new Laptop(25000, "Lenovo", 16);
        Laptop details1 = new Laptop(35000, "Apple", 4);
        Laptop details2 = new Laptop(45000, "Acer", 2);
        Laptop details3 = new Laptop(15000, "Dell", 16);
        Laptop details4 = new Laptop(12000, "Asus", 8);


        List<Laptop> list = new ArrayList<>();

        list.add(details);
        list.add(details1);
        list.add(details2);
        list.add(details3);
        list.add(details4);

         Collections.sort(list,new Dsc());

        System.out.println(list);



    }
}
