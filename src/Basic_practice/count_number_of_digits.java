package src.Basic_practice;

public class count_number_of_digits {


    public static void main(String[] args) {


        int num = 1232131232;


        int store=0;

        int count = 0;


        while (num!=0){


            store=  store+ num/10;

            num = num/10;


           count ++;
        }

        System.out.println("the count is "+count);

    }
}
