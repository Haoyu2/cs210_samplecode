/*
*
*
*
* Problem 8. (14 Points)
* Complete the data structure APIs of SeparateChainingLinkedListHashST<Key, Value>
*
* You can write your own tests in the main function.
*
*
*
*
*
* */









package umb.edu.cs210.test1;

import edu.princeton.cs.algs4.Queue;

public class SeparateChainingLinkedListHashST<Key, Value> {

    private int n;       // number of key-value pairs
    private int m;       // hash table size
    private Node[] st;   // array of linked-list symbol tables

    // a helper linked list data type
    private static class Node {
        private Object key;
        private Object val;
        private Node next;

        public Node(Object key, Object val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    // create separate chaining hash table with m lists
    public SeparateChainingLinkedListHashST(int m) {
        this.m = m;
        st = new Node[m];
    }


    // hash value between 0 and m-1
    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }

    // return number of key-value pairs in symbol table
    public int size() {
        return n;
    }

    // is the symbol table empty?
    public boolean isEmpty() {
        return size() == 0;
    }

    // is the key in the symbol table?
    public boolean contains(Key key) {
        return get(key) != null;
    }

    // return value associated with key, null if no such key
    public Value get(Key key) {

        return null;
    }

    // insert key-value pair into the table
    //When m <= n/8  resize st to m = 2*m

    public void put(Key key, Value val) {

    }

    // delete key (and associated value) from the symbol table
    //When m >= n/2 resize st to m = m/2

    public void delete(Key key) {
    }

    // return all keys as an Iterable from index  0 to last
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();



        return queue;
    }


    /***************************************************************************
     *  Unit test client.
     ***************************************************************************/
    public static void main(String[] args) {
        SeparateChainingLinkedListHashST<String, Integer> st = new SeparateChainingLinkedListHashST<String, Integer>(2);

    }
}