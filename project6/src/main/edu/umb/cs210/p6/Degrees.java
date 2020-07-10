package edu.umb.cs210.p6;


import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;

public class Degrees {
    private Digraph G;
    private int[] outdegree;
    private int[] indegree;

    // Construct a Degrees object from a digraph G.
    public Degrees(Digraph G) {
        setDegrees(G);

    }
    
    // Sources of G.
    public Iterable<Integer> sources() {


        return null;
    }

    // Sinks of G.
    public Iterable<Integer> sinks() {
        return null;

    }

    // Is G a map?
    public boolean isMap() {


        return false;

    }

    // helper method calculates the in and out degrees of each vertex
    private void setDegrees(Digraph g) {
        outdegree = new int[g.V()];
        indegree = new int[g.V()];
        for (int from = 0; from < g.V(); from++) {
            for (int to : g.adj(from)) {
                outdegree[from]++;
                indegree[to]++;
            }
        }
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        In in = args.length == 0 ? new In("data/tinyDG.txt") : new In(args[0]);
        Digraph G = new Digraph(in);
        Degrees degrees = new Degrees(G);

        StringBuilder sources = new StringBuilder();
        StringBuilder   sinks = new StringBuilder();
        for (int v : degrees.sources()) sources.append(v).append(" ");
        for (int v : degrees.sinks())     sinks.append(v).append(" ");

        StdOut.println("Sources = " + sources.toString());
        StdOut.println("Sinks   = " + sinks.toString());
        StdOut.println("Is Map  = " + degrees.isMap());
    }
}
