package src.Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue_Prac {

    public static void main(String[] args) {


        PriorityQueue <String> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer("Daddy");
        pq.offer("Anand");
        pq.offer("ball");
        pq.offer("Apple");
        pq.offer("Almond");
        pq.add("cherry");
        pq.offer("Orange");



        System.out.println(pq);

        PriorityQueue <Integer> num = new PriorityQueue<>(Comparator.reverseOrder());

        num.add(10);
        num.add(5);
        num.add(2);
        num.add(12);

//        System.out.println(num.peek());
//        System.out.println( num.remove());




        System.out.println(num);

    }
}
