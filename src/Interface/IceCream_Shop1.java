package src.Interface;

public class IceCream_Shop1 implements Business_Document {

    public void LassiShop() {

        System.out.println("My lassi shop is Kwality foods");

    }


    public void iceCreamFlavors() {


        System.out.println("my flavors are so sweet");


    }
@Override
    public void typeOfIceCreams() {

        boolean eating = true;

        if (eating) {

            String[] icecreams = new String[4];

            icecreams[0] = "vanilla";
            icecreams[1] = "strawberry";
            icecreams[2] = "caramel";
            icecreams[3] = "Choclate";

            for (int i = 0; i < icecreams.length; i++) {


                System.out.println(icecreams[i]);


            }

        }


    }


    static public void ConeIceCreams() {
        System.out.println("Here are the cone ice creams");

    }


}





