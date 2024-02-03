package src.Collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mp3 {
    public static void main(String[] args) {


        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("1BHK room", 25000);
        hm.put("2BHK room", 50000);
        hm.put("3BHK room", 65000);
        hm.put("4BHK room", 85000);


      Collection<Integer> c= hm.values();

        System.out.println(c);

       Set<Map.Entry<String,Integer>> s= hm.entrySet();


       for (Map.Entry <String,Integer> d :s)
       {

           System.out.println(d.getKey()+">>>"+d.getValue());

           if(d.getValue().equals(25000)){

               d.setValue(35000);
               System.out.println("1BHK amount changed to"+">>>"+d.getValue());
           }

       }

       // System.out.println(hm);

    }
}
