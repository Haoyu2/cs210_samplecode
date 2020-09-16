/*
*
*   1. A variable is a name that refers to a value.
*   2. A literal is a programming-language representation of a value.
*   3. A declaration statement associates a variable with a type.
*   4. An assignment statement associates a value with a variable.
*
*   *5. A variable in OS represents an address in memory, a literal represents the values
*       within the memory starting from that address.
*   *6, A variable is also called a left value(l-value), a literal is also called right value (r-value);
*       l-value can be on both side of of an assignment, but a r-value can only be on the right side.
*
*
* */



package lec1.bpc;

public class Exchange {
    public static void main(String[] args)
    {
        int a = 1234;
        int b = 99;
        int t = a;
        a = b;
        b = t;

//        printf means formated  output.
        System.out.printf("a: %5d\nb: %5d\n",a,b);
    }
}
