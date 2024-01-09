package src.Strings;

public class Reverse_String {

    // write a program to reverse a string
    // input: java is super output : repus si avaj

    public static void main(String[] args) {


        String text = " java is super";



          char[] name  = text.toCharArray();

        int left =0;

        int right = name.length-1;


        while (left<right){

            char temp = name[left];

            name[left] = name[right];

            name[right] = temp;

            left++;

            right--;



        }

        System.out.println(name);



    }


}
