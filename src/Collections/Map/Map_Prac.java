package src.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Prac {

    public static void main(String[] args) {


        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(33, "rama");
        hm.put(37, "sita");
        hm.put(31, "siva");
        hm.put(30, "parvathi");
        hm.put(20, "ganesh");

        System.out.println("######");
        System.out.println(hm.entrySet());

       Set<Map.Entry<Integer, String>> st = hm.entrySet();

//        Set<Map.Entry<Integer, String>> st = hm.entrySet();

//       Iterator itr = st.iterator();



       for(Map.Entry<Integer, String> t :st){


           System.out.println(t.getValue() + ">>>"+t.getKey());


           if(t.getKey().equals(20)){


               t.setValue("lord ganesha");

           }

       }
        System.out.println(hm);



//        while (itr.hasNext()) {
//
//            Map.Entry<Integer,String> e = (Map.Entry) itr.next();
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//
//            System.out.println("  ...");
//
//            if (e.getKey().equals(33)) {
//
//                e.setValue("raghava");
//            }
//
//        }
//        System.out.println(hm);

    }
}
