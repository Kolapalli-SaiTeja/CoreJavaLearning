package src.Collections.Map;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

    public static void main(String[] args) {
        // Creating a Vector object
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        vector.elements()

        // Getting an Enumeration from the Vector
        Enumeration<String> enumeration = vector.elements()

        // Using methods of the Enumeration interface
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }
    }
}