


/*
 * Problem 9. (10 Points)
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * You can write your own tests in the main function.
 *
 *
 *
 * */


package umb.edu.cs210.test1;

public class ValidBST {


    class BSTTest<Key extends Comparable<Key>, Value> {
        private Node root;             // root of BST

        private class Node {
            private Key key;           // sorted by key
            private Value val;         // associated data
            private Node left, right;  // left and right subtrees

            public Node(Key key, Value val) {
                this.key = key;
                this.val = val;
            }
        }

    }


    public boolean isValidBST(BSTTest bst) {






        return false;
    }

    public static void main(String[] args) {

    }
}
