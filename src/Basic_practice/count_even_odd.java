package src.Basic_practice;

public class count_even_odd {
    public static void main(String[] args) {


//        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//
//        int even_count = 0;
//
//        int odd_count =0;
//
//
//        for (int i=0; i<num.length; i++){
//
//
//              if(num[i]%2==0)
//              {
//
//              even_count++;
//
//            }
//              else {
//
//                  odd_count++;
//
//              }
//
//
//        }
//
//        System.out.println("the even count is "+even_count+" the odd count is " +odd_count);




        int num = 123456789;

        int even_count = 0;

        int odd_count =0;


        while (num>0){


            int rem = num%10;

         if(rem%2==0){

             even_count++;
         }
         else {

             odd_count++;
         }

         num =num/10;

        }

        System.out.println("The even count is "+ even_count+" The odd count is "+odd_count);
    }
}
