package src.Inheritance;

public class Audi {

    String carModel;
    int carCost;
    String carColor;


    void startCar() {


        System.out.println("The car model is " + carModel);
        System.out.println("The car cost is " + carCost);
        System.out.println("The car color is " + carColor);


        boolean startcar = true;

        if (startcar) {

            System.out.println("starting car");


        }

    }

    void stopCar(){
        boolean stopCar= true;

        if (stopCar){

            System.out.println("Stopping car");

        }


    }



}