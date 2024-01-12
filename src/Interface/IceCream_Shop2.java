package src.Interface;


import java.util.Arrays;

public class IceCream_Shop2 implements Business_Document {

    public void LassiShop() {

        System.out.println("My lassi shop is Arun foods");

    }


    public void iceCreamFlavors() {


        System.out.println("my flavors are so hot");


    }

    public void typeOfIceCreams() {

        boolean eating = true;

        if (eating) {

            String[] icecreams = new String[4];

            icecreams[0] = "Lotus biscoff";
            icecreams[1] = "Mango";
            icecreams[2] = "coffee";
            icecreams[3] = "Nuts overload";

            for (int i = 0; i < icecreams.length; i++) {

              String  str = icecreams[i];

              String[] store= str.split(" ");

                System.out.print(Arrays.toString(store));

                System.out.println(" ");






            }

        }


    }


    static public void ConeIceCreams() {
        System.out.println("Here are the cone ice creams");

    }


}







