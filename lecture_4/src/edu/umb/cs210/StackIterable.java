package edu.umb.cs210;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackIterable <Type> implements Iterable <Type> {
    private Node top = null;
    private int n=0;


// top-> next -> next -> end; The entry point of our stack/linkedlist is top node
    private class Node {
        Type item;
        Node next;
    }



    public boolean isEmpty() {
        return top == null;
    }

    public void push(Type item) {
        Node oldtop = top;
        top = new Node();
        top.item = item;
        top.next = oldtop;
        n++;
    }

    public Type pop() {
        Type item = top.item;
        top = top.next;
        if(n>0)   n--;
        return item;
    }

    public int getN() {
        return n;
    }

    @Override
    public Iterator<Type> iterator() {
        return new LinkedIterator(top);
    }

    private class LinkedIterator implements Iterator<Type>{
        private Node current;

        public LinkedIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        //this is an iteration on linkedlist
        @Override
        public Type next() {
            if (!hasNext()) throw new NoSuchElementException();
            Type item = current.item;
            current = current.next;
            return item;
        }


        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    public static void main(String[] args) {


        String[] strings = new String[]{
                "That", "looks", "very", "good"
        };



        StackIterable<String> stack = new StackIterable();
        for (String s : strings) {
            stack.push(s);
            System.out.print(s + "\t");
        }
        System.out.println();

        for (String s :stack) {
            System.out.print(s+ "\t");
        }
    }
}

