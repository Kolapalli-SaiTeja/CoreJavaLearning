package src.Collections.compare_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparing_last_int {

    public static void main(String[] args) {


        Comparator <Integer> com = new Comparator<Integer>() {

            public int compare(Integer A, Integer B) {

                if(A%10>B%10){

                    return 1;   //SWAP

                }else {

                    return -1;
                }
            }
        };


        List <Integer> ls = new ArrayList<>();


        ls.add(32);
        ls.add(39);
        ls.add(24);
        ls.add(22);
        ls.add(11);
        ls.add(10 );



        Collections.sort(ls,com);
        System.out.println(ls);





    }
}
