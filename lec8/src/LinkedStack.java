import dsa.Stack;
import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This data type provides an implementation of the Stack API, using a linked-list as the
 * underlying data structure.
 */
public class LinkedStack<Item> implements Stack<Item> {
    private Node first; // beginning of the stack
    private int n;      // number of items in the stack

    /**
     * Constructs an empty stack.
     */
    public LinkedStack() {
        first = null;
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
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * @inheritDoc
     */
    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return first.item;
    }

    /**
     * @inheritDoc
     */
    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    /**
     * Returns an iterator to iterate over the items in this stack in LIFO order.
     *
     * @return an iterator to iterate over the items in this stack in LIFO order.
     */
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return a string representation of this stack.
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
        LinkedStack<String> stack = new LinkedStack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                StdOut.print(stack.pop() + " ");
            }
        }
        StdOut.println();
        StdOut.println(stack.size() + " items left in the stack");
        StdOut.println(stack);
    }
}
