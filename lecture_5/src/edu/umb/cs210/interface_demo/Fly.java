package edu.umb.cs210.interface_demo;

public interface Fly {
    void canFly();
    public default void fly(){
        System.out.println("Flying needs wings");
    }
}
