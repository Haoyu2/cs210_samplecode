package edu.umb.cs210;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedList<Type> implements Iterable<Type> {
    private Node<Type> entry;

    @Override
    public Iterator<Type> iterator() {
        return new LinkedListIterator(entry);
    }

    private class LinkedListIterator implements Iterator<Type> {
        private Node current;

        public LinkedListIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        //this is an iteration on linkedlist
        @Override
        public Type next() {
            Type item = (Type) current.val;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    class Node<Type> {
        Type val;
        Node next;
    }

// entry->node1->node2->newnode -> null
    // take linear time
    public void add(Type val) {
        System.out.println(val.toString());
        Node<Type> node = new Node<>();
        node.val = val;
        node.next = null;
        if (entry == null) {
            entry = node;
        }
        Node temp = entry;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        LinkedList<Integer> l = new LinkedList();
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            l.add(a[i]);
        }
//        for (Integer i : l) {
//            System.out.println(i);
//        }

    }

}
