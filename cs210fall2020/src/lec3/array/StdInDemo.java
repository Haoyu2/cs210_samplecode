package lec3.array;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StdInDemo {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()){
            int x = StdIn.readInt();
            StdOut.println(x);
        }
    }
}
