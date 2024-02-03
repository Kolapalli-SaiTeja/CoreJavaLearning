package src.Collections.Map;

import java.util.HashMap;
import java.util.*;

public class Hashmap {
    public static  void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        // key  value
        hm.put(139, "rama");
        hm.put(137, "sita");
        hm.put(135, "hanuman");
        hm.put(133, "lakshman");
        hm.put(136, "casaradh");


        System.out.println(hm);

        System.out.println("$$$$$$");

        System.out.println(hm.get(139));

//        hm.remove(139);

        System.out.println(hm);

        System.out.println(hm.containsKey(139));
        System.out.println(hm.containsValue("sita"));
        System.out.println(hm.isEmpty());

        System.out.println(" ");


      Set<Integer> keys= hm.keySet();

        for(Integer key : hm.keySet()){

            System.out.println(" Keys are " + key + " Values are "+hm.get(key));
        }


      Collection <String> s= hm.values();

        for(String folder :s){

            System.out.println(folder);

        }





    }
}
