package src.Collections;

import java.util.Enumeration;
import java.util.Objects;
import java.util.Vector;

public class Vector_prac {

    public static void main(String[] args) {

        Vector<String>  v1 = new Vector<>();

        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add("rama");
        v1.add(0, "sita");
        v1.add("janaki");
//        System.out.println(v1);
//
//        System.out.println(v1.get(0));

      Enumeration<String> v = v1.elements();

      while(v.hasMoreElements()){

          System.out.println( v.nextElement());

      }


//        Vector v2 = new Vector();
//
//        v2.add("parvathi");
//        v2.add("shiva");
//        v2.add("ganesh");
//        v2.add("subramanyan");
//
//
//        v2.set(0,"lalitha");
//
//
//
//        for(int i = 0; i<v2.size();i++)
//        {
//
//           v1.add((String) v2.get(i));
//
//        }
//
//        System.out.println(v1);
//
//
//       // System.out.println(v2);
//
//        System.out.println(v2.size());
//        System.out.println(v2.capacity());
//
//
//        System.out.println(v1.containsAll(v2));  //false
//        System.out.println(v1.contains("janaki")); //true
//        System.out.println(v1.contains("shiva"));  //false











    }
}
