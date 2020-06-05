package edu.umb.cs210.inheritance;

public class Toyota extends Car{

    private ToyotaModels toyotaModels;

    public Toyota(CarType carType, ToyotaModels toyotaModels) {
        super(carType);
        this.toyotaModels = toyotaModels;
    }

    public Toyota(CarType carType) {
        super(carType);
    }

    public void warrantPolicy(){
        System.out.println("Our Policy is blabla");
    }


    public static void main(String[] args) {
        Toyota rav4 = new Toyota(CarType.SUV,ToyotaModels.RAV4);
        rav4.canRun();
        rav4.warrantPolicy();
        System.out.println(rav4.getWheels());

    }
}
