package edu.umb.cs210.inheritance;

public class Car {
    public CarType carType;
    protected int wheels = 4;

    public Car(CarType carType) {
        this.carType = carType;
    }

    public void canRun(){
        System.out.println("Yes, I can run");
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                '}';
    }
}
