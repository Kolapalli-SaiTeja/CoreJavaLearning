package src.Inheritance;

public class finalCar {






    public static void main(String[] args) {



        Audi web = new Audi() ;

        web.carModel = "Audi";
        web.carCost = 850000;
        web.carColor = "black";

        web.startCar();
        web.stopCar();



        benz spidy = new benz();

        spidy.carModel = " Benzy";
        spidy.carCost =   940000;
        spidy.carColor = "black";
        spidy.newBrakeSize = 240;

        spidy.startCar();
        spidy.stopCar();
        spidy.AdditionCost();
        spidy.newFeature();






    }
}
