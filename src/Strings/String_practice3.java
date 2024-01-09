package src.Strings;

public class String_practice3 {


    // write the java program to count the total number of occurrences of a given character in a string

    // input: Hello world   target character : l  Answer : 3.

    public static void main(String[] args) {



        String str = "Hello world";

        char ch = 'l';

        int count = 0;


        for (int i = 0; i<str.length(); i++){


            if(str.charAt(i)==ch){


                count++;


            }


        }
        System.out.println("The occurrences of " + ch+ " are "+ count);

    }
}




