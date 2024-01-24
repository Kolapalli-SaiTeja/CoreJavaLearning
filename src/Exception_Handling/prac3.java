package src.Exception_Handling;

public class prac3 {

    public static void main(String[] args) {


        try {
            System.out.println(10/0);
        } catch (Exception e) {

            throw new ArithmeticException("Stupid a number cannot be divided with zero");


        }


    }
}
