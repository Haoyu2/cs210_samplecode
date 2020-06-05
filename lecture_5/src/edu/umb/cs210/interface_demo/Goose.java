package edu.umb.cs210.interface_demo;

public class Goose implements Fly,Walk {
    @Override
    public void canFly() {
        System.out.println("I can not fly");
    }

    @Override
    public void canWalk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Goose goose = new Goose();
        goose.canFly();
        goose.canWalk();
        goose.fly();
    }
}
