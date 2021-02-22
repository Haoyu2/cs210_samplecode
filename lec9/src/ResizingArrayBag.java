import dsa.Bag;
import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This data type provides an implementation of the Bag API, using an array as the underlying
 * data structure.
 */
public class ResizingArrayBag<Item> implements Bag<Item> {
    private Item[] a; // array of items
    private int n;    // number of items in the bag

    /**
     * Constructs an empty bag.
     */
    public ResizingArrayBag() {
        a = (Item[]) new Object[2];
        n = 0;
    }

    /**
     * @inheritDoc
     */
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
        if (n == a.length) {
            resize(2 * a.length);
        }
        a[n++] = item;
    }

    /**
     * Returns an iterator to iterate over the items in this bag.
     *
     * @return an iterator to iterate over the items in this bag.
     */
    public Iterator<Item> iterator() {
        return new ArrayIterator();
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

    // Resizes the underlying array to capacity.
    private void resize(int capacity) {
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    // An iterator over an array.
    private class ArrayIterator implements Iterator<Item> {
        private int i; // index of the current item

        // Constructs an iterator.
        public ArrayIterator() {
            i = 0;
        }

        // Returns true if there are more items to iterate, and false otherwise.
        public boolean hasNext() {
            return i < n;
        }

        // Returns the next item.
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Iterator is empty");
            }
            return a[i++];
        }
    }

    /**
     * Unit tests the data type.
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        ResizingArrayBag<String> bag = new ResizingArrayBag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }
        StdOut.println(bag.size() + " items in the bag");
        StdOut.println(bag);
    }
}
