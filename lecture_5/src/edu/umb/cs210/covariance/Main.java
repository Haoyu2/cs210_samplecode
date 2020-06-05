package edu.umb.cs210.covariance;

import edu.umb.cs210.inheritance.Car;
import edu.umb.cs210.inheritance.RAV4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Number[] numbers = new Number[3];
        numbers[0] = new Integer(10);
        numbers[1] =  new Double(3.14);

        Integer[] myInts = {1,2,3,4};
        Number[] myNumber = myInts;
        myNumber[0] = 3.14; // pass the compiling, wrong in run-time

//        ArrayList<Car> car = new ArrayList<RAV4>();

//        LinkedList<Car> car = new LinkedList<RAV4>();


    }

}
