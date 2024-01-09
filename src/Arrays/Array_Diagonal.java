package src.Arrays;

public class Array_Diagonal {

    public static void main(String[] args) {


        int[][] array2d = new int[3][3];


        array2d[0][0] = 22;   // 22 50 1
        array2d[0][1] = 50;
        array2d[0][2] = 1;

        array2d[1][0] = 23;  //23 100 2
        array2d[1][1] = 100;
        array2d[1][2] = 2;

        array2d[2][0] = 14;  // 14 20 40
        array2d[2][1] = 20;
        array2d[2][2] = 40;


        for (int i = 0; i < array2d.length; i++) {


            System.out.println(array2d[i][i]);


        }
    }
}