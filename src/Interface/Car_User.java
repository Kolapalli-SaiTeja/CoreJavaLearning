package src.Interface;

public class Car_User implements Engine, Brake{
    @Override
    public void setBrakes() {
        System.out.println("brakes are working fine");
    }

    @Override
    public void startCar() {
        System.out.println("Start car");
    }
}
