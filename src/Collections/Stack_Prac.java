package src.Collections;

import java.util.Stack;

public class Stack_Prac {
    public static void main(String[] args) {


        Stack <String> books = new Stack<>();

        books.push("rama");
        books.push("sita");
        books.push("hanuman");
        books.push("surya");

       // System.out.println(books.pop());

        System.out.println(books);
        System.out.println(books.peek());
        System.out.println( books.search("sita"));
        System.out.println(books.indexOf("sita"));

    }
}
