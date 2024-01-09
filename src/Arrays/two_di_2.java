package src.Arrays;

public class two_di_2 {

    public static void main(String[] args) {


        int[][] arr2 = new int[2][3];

        arr2[0][0] = 15;
        arr2[0][1] = 12;
        arr2[0][2] = 14;


        arr2[1][0] = 13;
        arr2[1][1] = 20;
        arr2[1][2] = 22;



        for (int i =0;i<arr2.length; i++){

            for (int j =0; j<arr2[i].length; j++){

                System.out.print(arr2[i][j]+ "\t");

            }


            System.out.println(" ");


        }



    }
}
