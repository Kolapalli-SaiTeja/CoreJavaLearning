package src.Setter_And_Getters;

public class car {


    private String CarModel;
    private int carCost;
    private String carColor;


 ////// Setters >> using setters we can assign the value to the private variables
    public void setCarModel(String CarModel)
    {

        this.CarModel = CarModel;

    }
    public void setCarCost(int  carCost)
    {

        this.carCost = carCost;

    }
    public void setCarColor(String carColor)
    {

        this.carColor = carColor;

    }

    // Getters>> using getters we can get the assigned values



    public String getCarModel()
    {
       return CarModel;

    }
    public int getCarCost()
    {
        return carCost;

    }

    public String getCarColor()
    {
        return carColor;

    }


}

