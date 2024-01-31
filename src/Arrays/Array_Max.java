package src.Arrays;

public class Array_Max {
    public static void main(String[] args) {


        //find max number from an array and print along with its index
        // [2,5,1, 9, 6]


        int[] arr = new int[6];

        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 17878;
        arr[3] = 156;
        arr[4] = 6;
        arr[5] = 'B';


        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }

        }
        System.out.println(max);

    }
}