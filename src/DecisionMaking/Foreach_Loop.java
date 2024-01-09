package src.DecisionMaking;

public class Foreach_Loop {

    public static void main(String[] args) {



        int[] marks = {12, 13, 14, 15};


        int sum = 0;

        for (int god : marks) //[ 12, 13, 14, 15]

        {
            sum = sum + god;


            //  System.out.println(god);


        }

        System.out.println(sum);


    }

}
