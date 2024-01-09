package src.Arrays;

import java.util.Arrays;

public class Two_Di_Array {


    public static void main(String[] args) {


        int[][] arr = new int[3][3];
        //int arr2 [][]= new int [3][3];

        arr[0][0] = 12;
        arr[0][1] = 13;
        arr[0][2] = 15;


        arr[1][0] = 19;
        arr[1][1] = 16;
        arr[1][2] = 20;


        arr[2][0] = 22;
        arr[2][1] = 23;
        arr[2][2] = 21;


        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + "\t");

            }

            System.out.println("  ");


        }

    }
}

