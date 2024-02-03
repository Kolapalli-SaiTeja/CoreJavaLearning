package src.Collections.Queue;

import java.util.ArrayDeque;

public class Array_Deq {
    public static void main(String[] args) {


        ArrayDeque <String> ad = new ArrayDeque<>();

        ad.add("cherry");
        ad.addFirst("Almond");
        ad.addFirst("berry");
        ad.addLast("lemon");
        ad.offer("orange");
        ad.offerLast("kiwi");
        ad.add("apple");




        ArrayDeque <String> ad1 = new ArrayDeque<>();


        ad1.add("cherry");
        ad1.addFirst("mango");
        ad1.addLast("apple");
        ad1.offerLast("kiwi");
       
        
        
        ad1.poll();
        ad1.pollLast();
        ad1.pollFirst();


        System.out.println(ad1);

    }
}
