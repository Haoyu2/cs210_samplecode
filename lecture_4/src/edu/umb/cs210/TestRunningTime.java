package edu.umb.cs210;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import edu.umb.cs210.ThreeSum;

public class TestRunningTime {
    public static void main(String[] args) {
        String[] files = new String[]{
                "Data/1Kints.txt", "Data/2Kints.txt",
                "Data/4Kints.txt"
        };
        System.out.println("\t\t\tThreeSum\tThreeSumFast\tcounts");
        for (String txt : files) {

            System.out.print(txt + ":");
            In in = new In(txt);
            int[] a = in.readAllInts();

            Stopwatch timer = new Stopwatch();
            int count = ThreeSum.count(a);
            StdOut.print(timer.elapsedTime() + "s\t");

            timer = new Stopwatch();
            count = ThreeSumFast.count(a);
            StdOut.print(timer.elapsedTime() + "s\t");

            StdOut.println(count);

        }


    }
}
