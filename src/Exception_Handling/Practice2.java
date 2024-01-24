package src.Exception_Handling;


import java.util.Arrays;

public class Practice2 {


    public static void main(String[] args) {


        try {
            int a = 10;

            int b = 0;

            int result = a / b;


            int[] arr = new int[3];

            arr[0] = 1;
            arr[2] = 2;
            arr[3] = 4;
            arr[4] = 5;

            String name = "sai teja";

                    name.charAt(55);


        } catch (NumberFormatException  | ArithmeticException | ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException exception){




            System.out.println(exception.toString());


        }

        System.out.println("sri rama");
    }

}
