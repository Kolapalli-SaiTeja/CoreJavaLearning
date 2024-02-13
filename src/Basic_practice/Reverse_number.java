package src.Basic_practice;

public class Reverse_number {

    public static void main(String[] args) {


        int num = 1234;

        int rev = 0;

        while(num!=0){


          rev = rev*10+ num%10;

            num = num/10;


        }

        System.out.println(rev);

////////////////////
  ////// 2 METHOD

        StringBuffer buffer = new StringBuffer(String.valueOf(num));


      StringBuffer R =buffer.reverse();

        System.out.println(R);



        ////////////////////
        ////// 3rd METHOD

        StringBuilder sb = new StringBuilder();

        sb.append(num);
       StringBuilder r1 = sb.reverse();


        System.out.println(r1);




    }
}
