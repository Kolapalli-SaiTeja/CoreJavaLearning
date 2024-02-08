package src;

import java.util.Arrays;

public class string_E1 {
    public static void main(String[] args) {
        //Split gives Array and toString() of Array is just a ClassName@Hashcode,
        // thats why, you need to print via for each loop or for loop
        String str2 = "sai teja";
        String[] splistr = str2.split(" ");

        System.out.println(splistr.length);

        System.out.println(Arrays.toString(splistr));

        for (int i=0 ; i<splistr.length;i++)

        {

            System.out.println(splistr[i]);


        }

    }

}