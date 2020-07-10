package edu.umb.cs210.p6;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

// An immutable data type for outcast detection.
public class Outcast {

    WordNet wordNet;

    // Construct an Outcast object given a WordNet object.
    public Outcast(WordNet wordnet) {
        this.wordNet = wordnet;
    }

    // The outcast noun from nouns.
    public String outcast(String[] nouns) {
        return null;

    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        args = args.length!=0 ? args :
                new String[]{
                        "data/synsets.txt",
                        "data/hypernyms.txt",
                        "data/outcast5.txt",
                        "data/outcast8.txt",
                        "data/outcast11.txt"
                };

        WordNet wordnet = new WordNet(args[0], args[1]);
        Outcast outcast = new Outcast(wordnet);
        for (int t = 2; t < args.length; t++) {
            In in = new In(args[t]);
            String[] nouns = in.readAllStrings();
            StdOut.println("outcast(" + args[t] + ") = "
                           + outcast.outcast(nouns));
        }
    }
}
