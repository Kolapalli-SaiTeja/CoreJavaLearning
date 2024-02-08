package src.Collections.compare_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class String_com {

    public static void main(String[] args) {


        Comparator <String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.length()<o2.length()){

                    return 1;

                }else {

                    return -1;
                }

            }
        };


        List <String> ls = new ArrayList<>();


        ls.add("sai");
        ls.add("balram");
        ls.add("Anantha");
        ls.add("krishna");
        ls.add("lakshmi");
        ls.add("shiva");


        Collections.sort(ls,com);
        System.out.println(ls);





    }
}
