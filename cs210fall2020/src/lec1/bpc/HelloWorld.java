/*
	
	-classpath or -cp:  means the path to the source code

	-d(destnation) : means the path for storing the output java class files

	Compilation: javac -d out  -cp libraries/algs4.jar src/lec1/bpc/HelloWorld.java
	Excecition: java -cp libraries/algs4.jar:out lec1.bpc.HelloWorld


*/




package lec1.bpc;

import edu.princeton.cs.algs4.StdOut;

public class HelloWorld {
    public static void main(String[] args) {
    	//System library is within the stardard
    	//
        System.out.println("Hello World!");
        // The StdOut is a third-part libary that needs to import specifically
        StdOut.print("Hello World!\n");
    }
}
