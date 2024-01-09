package src.Constructors;

public class Constructor_practice2 {

    String model;
    int CarCost;

    String color;


    public Constructor_practice2(String M, int Cc, String col) {

        this.model = M;
        CarCost = Cc;
        color = col;
    }


    public void carDetails() {

        System.out.println("The brand of the car is " + model);
        System.out.println("The cost of the car is " + CarCost);
        System.out.println("The color of the car is " + color);

    }

    public static void main(String[] args) {

        Constructor_practice2 carModels = new Constructor_practice2("Maruthi", 250000, "black");

        carModels.carDetails();

        System.out.println("      ");

        Constructor_practice2 carModels2 = new Constructor_practice2("Audi", 850000, "Black");


        carModels2.carDetails();


    }
}
