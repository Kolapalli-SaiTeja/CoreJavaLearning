package src;

public class Practice_prime {

    public static void main(String[] args) {

        // print prime number 1 to 50


        for (int i = 1; i <= 50; i++) {

            boolean isprime = true;

            for (int j = 2; j <=i / 2; j++) {


                if (i % j == 0) {

                    isprime = false;

                    break;
                }
            }

            if(i==1){

                System.out.println("1 is not a prime");
            }

            else if (isprime) {

                System.out.println("The prime numbers are " + i);

            }







        }
    }
}