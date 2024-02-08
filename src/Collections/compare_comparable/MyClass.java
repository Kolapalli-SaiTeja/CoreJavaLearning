package src.Collections.compare_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyClass {


    public static void main(String[] args) {


        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer A, Integer B) {

               if(A>B){

                   return -1;
               }else                  //(Descending order)

                   return 1;



            }                        // 9, 3, 6, 2, 1 // 3, 6, 2, 1, 9// 3, 2, 1, 6, 9// 1, 2, 3, 6, 9
        };


        List<Integer> ls = new ArrayList<>();


        ls.add(39);
        ls.add(23);
        ls.add(36);
        ls.add(32);
        ls.add(31);

        Collections.sort(ls,com);

        System.out.println(ls);
    }
}
