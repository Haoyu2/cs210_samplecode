package lec3.adt;

import edu.princeton.cs.algs4.StdOut;

/*
 *
 *   ctrl +shift + /:
 *   ctrl + alt + l: this auto formatting
 *
 *  shift + F6
 *
 * */
public class ADTDemo {
    static String hello1 = "hello";// static fileds
    String s = "World!"; // instance fields or non-static fileds


    ADTDemo(String s) {
        this.s = s;
    }

    // staic methods can only access static fileds
    //
    public static void printHello() {
        System.out.println(hello1);
    }

    //non-static methods
    public void printWorld() {
        String s = "local s";
        StdOut.print(s);
        System.out.println(this.s);
    }

    public static void main(String[] args) {
        ADTDemo.printHello();
        ADTDemo adtDemo = new ADTDemo("Big world!");// adtDemo is an instance of class ADTDemo
        adtDemo.printWorld();
    }
}
