package edu.umb.cs210.p6;


import edu.princeton.cs.algs4.*;

public class GraphProperties {
    private int[] eccentricities;
    private int diameter;
    private int radius;
    private LinkedQueue<Integer> centers;

    // Calculate graph properties for the graph G.
    public GraphProperties(Graph G) {
// *******YOU DO NOT NEED TO CHECK THIS CORNER CASE:
//      throw new IllegalArgumentException("G is not connected");
// ****** Ignore the corner case requirement for this problem ***************


    }




    
    // Eccentricity of v.
    public int eccentricity(int v) {
        return eccentricities[v];
    }

    // Diameter of G.
    public int diameter() {
        return diameter;
    }

    // Radius of G.
    public int radius() {
        return radius;
    }

    // Centers of G.
    public Iterable<Integer> centers() {
        return centers;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {

        In in = args.length == 0 ? new In("data/tinyG.txt") : new In(args[0]);
        Graph G = new Graph(in);
        GraphProperties gp = new GraphProperties(G);
        StdOut.println("Diameter = " + gp.diameter());
        StdOut.println("Radius   = " + gp.radius());
        StringBuilder centers = new StringBuilder();
        for (int v : gp.centers()) centers.append(v).append(" ");
        StdOut.println("Centers  = " + centers.toString());
    }
}
