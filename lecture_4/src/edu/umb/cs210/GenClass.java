package edu.umb.cs210;

import javax.swing.*;

public class GenClass <Type> {
    private Type val;
    private GenClass<Type> genClass;

    public GenClass(Type val) {
        this.val = val;
    }

    public Type getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "GenClass{" +
                "val=" + val.toString() +
                '}';
    }

    public static void main(String[] args) {
        GenClass<String> genClass = new GenClass<>("hello world!");
        GenClass<Double> doubleGenClass = new GenClass<>(3.1415926);
        System.out.println(genClass.toString());
        System.out.println(doubleGenClass.toString());

        LinkedListStack listStack = new LinkedListStack();
        GenClass<LinkedListStack> genClass1 = new GenClass<>(listStack);

        genClass1.getVal().push(1);
        genClass1.getVal().push(2);
        System.out.println(genClass1.getVal().pop());
    }
}
