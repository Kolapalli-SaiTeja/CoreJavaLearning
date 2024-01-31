package src.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList {

    public static void main(String[] args) {


        ArrayList <Integer>  A2 = new ArrayList<>();

        A2.add(1);
        A2. add(45);
        A2.add(33);
        A2.add(5);
        A2.add(88);
        A2.add(90);

        Collections.sort(A2);

        System.out.println(A2);




    }
}
