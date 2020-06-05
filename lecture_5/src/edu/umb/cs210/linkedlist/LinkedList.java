package edu.umb.cs210.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList<T> implements Iterable<T> {

    private Node entry;


    public void add(T item) {
        Node node = new Node(item);
        if (entry == null)
            entry = node;
        else {
            Node pointer = entry;
            while (pointer.next != null)
                pointer = pointer.next;
            pointer.next = node;
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>();
    }

    class LinkedListIterator<T> implements Iterator {
        private Node pointer = entry;

        @Override
        public boolean hasNext() {
            return pointer != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T item = (T) pointer.item;
            pointer = pointer.next;
            return item;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] a = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            linkedList.add(a[i]);
        }
        for (int i : linkedList) {
            System.out.println(i);
        }
        LinkedList<String> linkedList1 = new LinkedList<>();
        String[] ss = new String[]{
                "How", "are", "you"
        };
        for (int i = 0; i < ss.length; i++) {
            linkedList1.add(ss[i]);
        }
        for (String s : linkedList1) {
            System.out.println(s);
        }

    }
}
