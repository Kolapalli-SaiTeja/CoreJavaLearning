package src.Setter_And_Getters;

public class Demo {

    public static void main(String[] args) {

        car weby = new car();

        weby.setCarModel("Creta");
        weby.setCarColor("Black");
        weby.setCarCost(270000);

        System.out.println("The car model is "+weby.getCarModel());
        System.out.println("The car color is "+weby.getCarColor());
        System.out.println("The car cost  is "+weby.getCarCost());

    }


}
