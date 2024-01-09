package src.Strings;

import java.util.Locale;

public class Strings_Practice {

    public static void main(String[] args) {

        String s1 = "           Saiteja               ";

        String s2 = "saiteJA";


        System.out.println(s1.toLowerCase());

        System.out.println(s2.toUpperCase());

        System.out.println(s1.contains("S"));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.endsWith("a"));

        System.out.println(s1.startsWith(" "));

        System.out.println(s1.length());

        System.out.println(s1.lastIndexOf("a"));

        System.out.println(s1.trim());
        System.out.println(s1.trim().length());


       char[] name = s1.toCharArray();

        System.out.println(name);


    }
}
