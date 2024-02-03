package src.Collections;
import java.util.*;
public class LinkedList_prac {
    public static void main(String[] args) {


        LinkedList <String> L1 = new LinkedList<>();

        L1.add("T1");
        L1.add("T2");            // 12/2 = 6
        L1.add("T3");
        L1.add("T4");
        L1.add("T5");
        L1.add("T6");
        L1.add("T7");
        L1.add("T8");
        L1.add("T9");
        L1.add("T10");
        L1.add("T11");
//        L1.addFirst("T12");

    //    L1.add(1,"T4");

      //  System.out.println(L1);

        for(int i=L1.size()-1;i>0;i--)
        {

            System.out.println(L1.get(i));

        }





    }
}
