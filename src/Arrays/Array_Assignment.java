package src.Arrays;

public class Array_Assignment {
    public static void main(String[] args) {


        //input : [2,5,3,9,6] Average of integers in an Integer Array

        int[] marks = new int [6];


        marks[0] = 2;
        marks[1]= 5;
        marks[2] = 3;
        marks[3] = 9;
        marks[4] = 6;
        marks[5] = 10;

        int sum =0;

        for (int i =0 ; i<marks.length;i++){

            sum = sum+marks[i];



        }
        System.out.println(sum/marks.length);

    }
}
