package src.Arrays;

import java.util.Arrays;

public class Array_Assignmen3 {

    public static void main(String[] args) {


    int[] marks = {12,23, 34, 21, 22};
    int[] marks2 = {22, 45, 56, 23,};



    int[] total = new int[marks.length+marks2.length];



    for(int i =0; i<marks.length;i++)
    {

      total[i]=  marks[i];

    }

      for (int j =0; j<marks2.length; j++){


          total[j+marks.length] = marks2[j];


      }




        System.out.println( Arrays.toString(total));

}
}