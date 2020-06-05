package edu.umb.cs210;

public class GenClassMethod {
    public static <Type> Type show(Type val){
        System.out.println(val.toString());
        return val;
    }

    public static void main(String[] args) {
        System.out.println(GenClassMethod.show(3.1415926));
        System.out.println(GenClassMethod.show("That's good!"));
    }
}
