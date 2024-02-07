package src.Basic_practice;

import src.Collections.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class find_frequency {

    //find frequency of each element in an array

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 9, 7, 7, 1, 4, 4, 7, 7};
                 //  0, 1, 2, 3, 4, 5,
        //  6,7, 8, 9, 10

        HashMap<Integer, Integer> hm = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {


            if (hm.containsKey(arr[i])) {

                hm.put(arr[i], hm.get(arr[i])+1);


            } else {

                hm.put(arr[i], 1);
            }

        }


        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {


            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }
}
