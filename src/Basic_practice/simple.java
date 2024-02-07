package src.Basic_practice;

import java.util.HashMap;

public class simple {
    public static void main(String[] args) {


        int[] arr = {1, 4, 5, 9, 7, 7, 1, 4, 4, 7, 7};
        //  0, 1, 2, 3, 4, 5, 6,7, 8, 9, 10

        HashMap<Integer, Integer> hm = new HashMap<>();



        hm.put(7,1);
        System.out.println( hm.get(7)+1);

       // System.out.println(hm+ "noon");




//        for (int i = 0; i < arr.length; i++) {
//
//
//            if (hm.containsKey(arr[i])) {
//
//                hm.put(arr[i], hm.get(arr[i]));
//
//                System.out.println(hm);
    }
}
