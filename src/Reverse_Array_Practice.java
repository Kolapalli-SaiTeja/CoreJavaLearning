package src;

public class Reverse_Array_Practice {

    public static void main(String[] args) {


        // BATMAN


        // NEED THREE CONTAINERS



        String name = "BATMAN";

        char[] reverseName=name.toCharArray();


        int left = 0;

        int right = reverseName.length-1;


        while(left<right){


            char temp = reverseName[left];

            reverseName[left] = reverseName[right];

            reverseName[right] = temp;


            left++;

            right--;



        }


        System.out.println(reverseName);





    }
}
