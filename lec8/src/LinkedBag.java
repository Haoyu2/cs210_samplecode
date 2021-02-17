import dsa.Bag;
import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This data type provides an implementation of the Bag API, using a linked-list as the
 * underlying data structure.
 */
public class LinkedBag<Item> implements Bag<Item> {
    private Node first; // beginning of the bag
    private int n;      // number of items in the bag

    /**
     * Constructs an empty bag.
     */
    public LinkedBag() {
        first = null;
        n = 0;
    }

    /**
     * @inheritDoc
     */
//    public boolean isEmpty() {
//        return first == null;
//    }
//    equivalent
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * @inheritDoc
     */
    public int size() {
        return n;
    }

    /**
     * @inheritDoc
     */
    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Returns an iterator to iterate over the items in this bag.
     *
     * @return an iterator to iterate over the items in this bag.
     */
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    /**
     * Returns a string representation of this bag.
     *
     * @return a string representation of this bag.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : this) {
            sb.append(item);
            sb.append(", ");
        }
        return n > 0 ? "[" + sb.substring(0, sb.length() - 2) + "]" : "[]";
    }

    // A data type representing a linked-list of nodes. Each node contains an item and a
    // reference to the next node in the list.
    private class Node {
        private Item item;
        private Node next;
    }

    // An iterator over a linked list.
    private class ListIterator implements Iterator<Item> {
        private Node current; // current item in the iterator

        // Constructs an iterator.
        public ListIterator() {
            current = first;
        }

        // Returns true if there are more items to iterate, and false otherwise.
        public boolean hasNext() {
            return current != null;
        }

        // Returns the next item.
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Iterator is empty");
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
     * Unit tests the data type.
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        LinkedBag<String> bag = new LinkedBag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }
        StdOut.println(bag.size() + " items in the bag");
        StdOut.println(bag);
    }
}
