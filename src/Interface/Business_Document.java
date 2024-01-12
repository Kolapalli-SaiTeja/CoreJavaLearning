package src.Interface;

public interface Business_Document {

    public void LassiShop();


    public void iceCreamFlavors();


    default public void typeOfIceCreams() {

        System.out.println("types of icecreams are");


    }


    static public void ConeIceCreams() {
        System.out.println("Here are the cone ice creams");

    }


}
