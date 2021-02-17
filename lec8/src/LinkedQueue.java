import dsa.Queue;
import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This data type provides an implementation of the Queue API, using a linked-list as the
 * underlying data structure.
 */
public class LinkedQueue<Item> implements Queue<Item> {
    private Node first; // beginning of the queue
    private Node last;  // end of the queue
    private int n;      // number of items in the queue

    /**
     * Constructs an empty queue.
     */
    public LinkedQueue() {
        first = null;
        last = null;
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

//    add to the last
    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
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
        return first.item;
    }

    /**
     * @inheritDoc
     */
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    /**
     * Returns an iterator to iterate over the items in this queue in FIFO order.
     *
     * @return an iterator to iterate over the items in this queue in FIFO order.
     */
    public Iterator<Item> iterator() {
        return new ListIterator();
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
        LinkedQueue<String> queue = new LinkedQueue<String>();
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
