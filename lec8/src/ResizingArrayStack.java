import dsa.Stack;
import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This data type provides an implementation of the Stack API, using an array as the underlying
 * data structure.
 */
public class ResizingArrayStack<Item> implements Stack<Item> {
    private Item[] a; // array of items
    private int n;    // number of items in the bag

    /**
     * Constructs an empty stack.
     */
    public ResizingArrayStack() {
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
    public void push(Item item) {
        if (n == a.length) {
            resize(2 * a.length);
        }
        a[n++] = item;
    }

    /**
     * @inheritDoc
     */
    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return a[n - 1];
    }

    /**
     * @inheritDoc
     */
    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        Item item = a[n - 1];
        a[n - 1] = null;
        n--;
        if (n > 0 && n == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    /**
     * Returns an iterator to iterate over the items in this stack in LIFO order.
     *
     * @return an iterator to iterate over the items in this stack in LIFO order.
     */
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
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

    // Resizes the underlying array to capacity.
    private void resize(int capacity) {
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    // A reverse iterator over an array.
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i; // index of the current item

        // Constructs an iterator.
        public ReverseArrayIterator() {
            i = n - 1;
        }

        // Returns true if there are more items to iterate, and false otherwise.
        public boolean hasNext() {
            return i >= 0;
        }

        // Returns the next item.
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Iterator is empty");
            }
            return a[i--];
        }
    }

    /**
     * Unit tests the data type.
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<String>();
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