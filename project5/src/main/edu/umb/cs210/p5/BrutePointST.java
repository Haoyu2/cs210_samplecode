package edu.umb.cs210.p5;


import edu.princeton.cs.algs4.*;

import java.util.Iterator;

public class BrutePointST<Value> implements PointST<Value> {


    // Construct an empty symbol table of points.
    public BrutePointST() {

    }

    // Is the symbol table empty?
    public boolean isEmpty() {
        return false;
    }

    // Number of points in the symbol table.
    public int size() {
        return 0;
    }

    // Associate the value val with point p.
    public void put(Point2D p, Value val) {

    }

    // Value associated with point p.
    public Value get(Point2D p) {
        return null;
    }

    // Does the symbol table contain the point p?
    public boolean contains(Point2D p) {
        return false;
    }

    // All points in the symbol table.
    public Iterable<Point2D> points() {
        return null;
    }

    // All points in the symbol table that are inside the rectangle rect.
    public Iterable<Point2D> range(RectHV rect) {

        return null;
    }

    // A nearest neighbor to point p; null if the symbol table is empty.
    public Point2D nearest(Point2D p) {

        return null;
    }

    // k points that are closest to point p.
    public Iterable<Point2D> nearest(Point2D p, int k) {

        return null;

    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        BrutePointST<Integer> st = new BrutePointST<Integer>();
        double qx = Double.parseDouble(args[0]);
        double qy = Double.parseDouble(args[1]);
        double rx1 = Double.parseDouble(args[2]);
        double rx2 = Double.parseDouble(args[3]);
        double ry1 = Double.parseDouble(args[4]);
        double ry2 = Double.parseDouble(args[5]);
        int k = Integer.parseInt(args[6]);
        Point2D query = new Point2D(qx, qy);
        RectHV rect = new RectHV(rx1, ry1, rx2, ry2);
        int i = 0;
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            Point2D p = new Point2D(x, y);
            st.put(p, i++);
        }
        StdOut.println("st.empty()? " + st.isEmpty());
        StdOut.println("st.size() = " + st.size());
        StdOut.println("First " + k + " values:");
        i = 0;
        for (Point2D p : st.points()) {
            StdOut.println("  " + st.get(p));
            if (i++ == k) {
                break;
            }
        }
        StdOut.println("st.contains(" + query + ")? " + st.contains(query));
        StdOut.println("st.range(" + rect + "):");
        for (Point2D p : st.range(rect)) {
            StdOut.println("  " + p);
        }
        StdOut.println("st.nearest(" + query + ") = " + st.nearest(query));
        StdOut.println("st.nearest(" + query + ", " + k + "):");
        for (Point2D p : st.nearest(query, k)) {
            StdOut.println("  " + p);
        }
    }
}
