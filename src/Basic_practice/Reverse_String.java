package src.Basic_practice;

public class Reverse_String {


    public static void main(String[] args) {


        String str = "srirama";

        String r ="";

        for (int i=str.length()-1;i>=0; i--){


            r = r + str.charAt(i);
        }

        System.out.println(r);
    }
}
