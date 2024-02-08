package src.Basic_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex18 {
    public static void main(String[] args) {



        List<String> ttacourseList = new ArrayList<>();

        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET BluePrint");
        ttacourseList.add("java for testers");


      ListIterator <String>lt = ttacourseList.listIterator();

      while (lt.hasNext()){

          System.out.println(lt.next());
      }

    }
}
