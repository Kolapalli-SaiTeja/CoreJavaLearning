package src.DecisionMaking;

public class Assignment5 {

    //Print the sum of even numbers between 40 to 80

    public static void main(String[] args) {


        int i = 40;

        int sum =0;

        while (i<=80){

            if(i%2==0){

                System.out.println(i);
                sum= sum+i;


            }

            i++;
        }

        System.out.println("sum of even numbers is " + sum);



    }
}
