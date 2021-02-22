import dsa.Queue;
import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This data type provides an implementation of the Queue API, using an array as the underlying
 * data structure.
 */
public class ResizingArrayQueue<Item> implements Queue<Item> {
    private Item[] a;  // array of items
    private int first; // index of the first item
    private int last;  // index of the next available slot
    private int n;     // number of items in the queue

    /**
     * Constructs an empty queue.
     */
    public ResizingArrayQueue() {
        a = (Item[]) new Object[2];
        n = 0;
        first = 0;
        last = 0;
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
    public void enqueue(Item item) {
        if (n == a.length) {
            resize(2 * a.length);
        }
        a[last++] = item;
        if (last == a.length) {
            last = 0;
        }
        n++;
    }

    /**
     * @inheritDoc
     */
    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return a[first];
    }

    /**
     * @inheritDoc
     */
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Item item = a[first];
        a[first] = null;
        n--;
        first++;
        if (first == a.length) {
            first = 0;
        }
        if (n > 0 && n == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    /**
     * Returns an iterator to iterate over the items in this queue in FIFO order.
     *
     * @return an iterator to iterate over the items in this queue in FIFO order.
     */
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    /**
     * Returns a string representation of this queue.
     *
     * @return a string representation of this queue.
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
            temp[i] = a[(first + i) % a.length];
        }
        a = temp;
        first = 0;
        last = n;
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
            Item item = a[(i + first) % a.length];
            i++;
            return item;
        }
    }

    /**
     * Unit tests the data type.
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                StdOut.print(queue.dequeue() + " ");
            }
        }
        StdOut.println();
        StdOut.println(queue.size() + " items left in the queue");
        StdOut.println(queue);
    }
}
