package src.Abstraction;

public class User {

    public static void main(String[] args) {


        Laptop web = new Apple();

        web.cut();
        web.keyboardLight();
        web.GamingMode();
        System.out.println("....");

        Lenovo file = new Lenovo();


        file.cut();
        file.turnOn();
        file.keyboardLight();





    }
}
