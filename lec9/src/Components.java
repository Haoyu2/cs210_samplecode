// Accepts n (int) and a sequence of integer pairs from standard input, where each integer
// (between 0 and n - 1) in the pair represents some site; merges the sites if they are in
// different components; and writes to standard output the number of components left.

import dsa.WeightedQuickUnionUF;
import stdlib.StdIn;
import stdlib.StdOut;

public class Components {
    // Entry point.
    public static void main(String[] args) {
        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            uf.union(p, q);
        }
        StdOut.println(uf.count() + " components");
    }
}
