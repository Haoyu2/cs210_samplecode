// Accepts a sequence of doubles from standard input; and writes their mean and standard
// deviation to standard output.

import dsa.LinkedBag;
import stdlib.StdIn;
import stdlib.StdOut;

public class Stats {
    // Entry point.
    public static void main(String[] args) {
        LinkedBag<Double> bag = new LinkedBag<Double>();
        while (!StdIn.isEmpty()) {
            bag.add(StdIn.readDouble());
        }
        int n = bag.size();
        double sum = 0.0;
        for (double x : bag) {
            sum += x;
        }
        double mean = sum / n;
        sum = 0.0;
        for (double x : bag) {
            sum += (x - mean) * (x - mean);
        }
        double stddev = Math.sqrt(sum / (n - 1));
        StdOut.printf("Mean:    %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", stddev);
    }
}