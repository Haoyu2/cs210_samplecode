package edu.umb.cs210.inheritance;

// RAV4 -> Toyota -> Car
// Civiv -> Honda -> Car
public class RAV4 extends Toyota {

    private boolean hybrid;

    public RAV4(boolean hybrid) {
        super(CarType.SUV, ToyotaModels.RAV4);
        this.hybrid = hybrid;
    }

    public void powerBy() {
        if (hybrid)
            System.out.println("I am powered by hybrid enegy");
        else
            System.out.println("I am powered by gas");

    }

    public static void main(String[] args) {
        RAV4 rav4 = new RAV4(false);
        rav4.canRun();
        rav4.warrantPolicy();
        rav4.powerBy();
    }
}
