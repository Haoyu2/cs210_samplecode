package edu.umb.cs210.p6;


import edu.princeton.cs.algs4.*;


// An immutable WordNet data type.
public class WordNet {

    RedBlackBST<String, SET<Integer>> st;
    RedBlackBST<Integer, String> rst;
    ShortestCommonAncestor sca;

    // Construct a WordNet object given the names of the input (synset and
    // hypernym) files.
    public WordNet(String synsets, String hypernyms) {



    }

    // All WordNet nouns.
    public Iterable<String> nouns() {

        return st.keys();
    }

    // Is the word a WordNet noun?
    public boolean isNoun(String word) {
        return st.contains(word);

    }

    // A synset that is a shortest common ancestor of noun1 and noun2.
    public String sca(String noun1, String noun2) {

        return null;
    }

    // Distance between noun1 and noun2.
    public int distance(String noun1, String noun2) {

        return 1;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {

        if (args.length==0)
            args =  new String[]{
                    "data/synsets.txt",
                    "data/hypernyms.txt","worm",
                    "bird"
            } ;


        WordNet wordnet = new WordNet(args[0], args[1]);
        String word1 = args[2];
        String word2 = args[3];
        int nouns = 0;
        for (String noun : wordnet.nouns()) {
            nouns++;
        }
        StdOut.println("# of nouns = " + nouns);
        StdOut.println("isNoun(" + word1 + ") = " + wordnet.isNoun(word1));
        StdOut.println("isNoun(" + word2 + ") = " + wordnet.isNoun(word2));
        StdOut.println("isNoun(" + (word1 + " " + word2) + ") = "
                + wordnet.isNoun(word1 + " " + word2));
        StdOut.println("sca(" + word1 + ", " + word2 + ") = "
                + wordnet.sca(word1, word2));
        StdOut.println("distance(" + word1 + ", " + word2 + ") = "
                + wordnet.distance(word1, word2));
    }
}
