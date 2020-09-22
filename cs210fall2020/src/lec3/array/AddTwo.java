package lec3.array;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

class AddTwo {
    public static void main(String[] args) {
        StdOut.print("Type the first integer: ");
        int x = StdIn.readInt();
        StdOut.print("Type the second integer: ");
        int y = StdIn.readInt();
        int sum = x + y;
        StdOut.println("Their sum is " + sum);
    }
}
