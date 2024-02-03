package src.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MP {

    public static void main(String[] args) {


        HashMap<Integer, String> hm = new HashMap<>();


        hm.put(23, "shiva");
        hm.put(24, "parvathi");
        hm.put(1, "zarach");
        hm.put(20, "ganga");
        hm.put(15, "ganesha");
        hm.put(10, "subramanya");


        hm.replace(23,"narayana");





        System.out.println(hm);


//        for (Integer i : hm.keySet()) {
//
//            System.out.println(hm.get(i));
//
//
//        }
//

    }
}
