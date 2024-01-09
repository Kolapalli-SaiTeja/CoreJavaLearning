package src;

public class primenumber_6 {


    public static void main(String[] args) {

        //print prime numbers from 60 to 100



        for (int i =60; i<=100; i++){

            boolean isPrime = true;

            for (int j=2; j<=i/2;j++){

                if(i%j==0){


                    isPrime = false;

                    //System.out.println(" Not a prime number " + i);

                    break;
                }



                }

            if (isPrime){

                System.out.println("Prime numbers are "+i);
            }




        }





    }
}
