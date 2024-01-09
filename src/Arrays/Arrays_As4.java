package src.Arrays;

import java.util.Arrays;

public class Arrays_As4 {

    public static void main(String[] args) {


        String[] Goods = {"chai","coffee","mango"};

        String[] Goods2 = {"milk", "water","coke"};


        String[]   total = new String[Goods.length+ Goods2.length];



        for (int i=0; i< Goods.length; i++){


            total[i] = Goods[i];


        }

        for (int i=0;i< Goods2.length; i++){


            total[i+ Goods.length] = Goods2[i];







        }
        System.out.println(Arrays.toString(total));


    }
}
