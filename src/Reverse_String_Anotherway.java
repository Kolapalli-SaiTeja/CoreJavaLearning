package src;

public class Reverse_String_Anotherway {

    public static void main(String[] args) {


        String name = "spiderman";

        char[] reverseName    =  name.toCharArray();



         int left = 0;                                    //  s  p  i  d  e  r  m  a  n
                                                           // 0  1  2  3  4  5  6  7  8
         int right = reverseName.length-1;



         while (left<right){


     char temp = reverseName[left];

     reverseName[left] = reverseName[right];


     reverseName[right]= temp;


     left ++;

     right--;



         }


        System.out.println( reverseName);






    }
}
