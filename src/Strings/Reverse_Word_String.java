package src.Strings;

import java.util.Arrays;

public class Reverse_Word_String {


    // Reverse a word in a given string // sai teja >>> ias ajet

    public static void main(String[] args) {


        String name = "sai teja";


        String[] name1=  name.split(" "); // After splitting with space the name will be [ sai, teja]

       // System.out.println(Arrays.toString(name1));

        String reversed_name = "";


        for(String Original: name1)                                  // now here sai is stored in original, we need to reverse it
                                                                    // now here teja is stored in original, we need to reverse it
            {

          String reversedString = "";                               // we just gave "" this be just blank, so that strings will come here

            for (int i = Original.length()-1; i>=0; i--)             // sai> length is 3 in arrays its 0,1,2, so 3-1, starts from 2, till 0
            {

                                                                           // teja length is 4  in arrays its, 0,1,2,3
              reversedString = reversedString + Original.charAt(i);


            }


                reversed_name = reversed_name + reversedString+ " ";       //  created another variable reversed_name to add space " "

        }
        System.out.println(reversed_name);



    }
}
