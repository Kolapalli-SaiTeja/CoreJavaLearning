package src.Basic_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex19 {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();

        li.add(20);
        li.add(60);
        li.add(80);
        li.add(888);
        li.add(99);


        ListIterator<Integer> lt = li.listIterator();

        while (lt.hasNext()){

            lt.add(1000);

            System.out.println(lt.next());
        }

    }
}
