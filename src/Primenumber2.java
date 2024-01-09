package src;

public class Primenumber2 {

    public static void main(String[] args) {

        //print the prime numbers between 50 to 150



        int num = 50;

        for (int i = 2; i <= num; i++) {

            boolean isprime = true;

            for (int j = 2; j <= i/2; j++) {


                if (i % j == 0) {

                    isprime = false;

                    break;
                }

            }

            if (isprime) {

                System.out.println("is prime " + i);
            }
        }
    }
}
