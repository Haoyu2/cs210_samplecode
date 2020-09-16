/*


	Compilation: javac -d out/production/cs210fall2020 src/lec1/bpc/Exchange1.java
	Execution: java -cp out/production/cs210fall2020 lec1.bpc.Exchange1 20 30

    A package in Java is used to group related classes.
    Think of it as a folder in a file directory.
    We use packages to avoid name conflicts, and to write a better maintainable code.

    *** A full java program name is started by its package name ***



*/



package lec1.bpc;

public class Exchange1
{
    public static void main(String[] args)
    {
        System.out.println(args[0]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
    }
}
