package edu.umb.cs210.stack;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackResizeingArray<T> implements Iterable<T> {

    private T[] arr;
    private int n = 0;

    public StackResizeingArray() {
        this.arr = (T[]) new Object[2];
    }

    public void push(T item) {
        if (n == arr.length) resize(2 * arr.length);
        arr[n++] = item;
    }

    public T pop() {
        if (isEmpty()) throw new NoSuchElementException("No elements in stack for popping");
        T item = arr[n - 1];
        n--;
        if (n > 0 && n == arr.length / 4) resize(arr.length / 2);
        return item;

    }

    private void resize(int i) {
        T[] newArr = (T[]) new Object[i];
        for (int j = 0; j < arr.length; j++) {
            newArr[j] = arr[j];
        }
        arr = newArr;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) new StackIterator<T>();
    }

    class StackIterator<T> implements Iterator<T> {
        private int i = n - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return (T) arr[i--];
        }
    }

    public static void main(String[] args) {
        StackResizeingArray<String> stack = new StackResizeingArray<>();
        String[] ss = new String[]{"how","are", "you"};
        for (int i = 0; i < ss.length; i++) {
            stack.push(ss[i]);
        }

//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            if (!item.equals("-")) stack.push(item);
//            else if (!stack.isEmpty()) StdOut.print(stack.pop() + " ");
//        }
        for (String s : stack
        ) {
            System.out.print(s+"\t");
        }
        System.out.println();
        for (String s : stack
        ) {
            System.out.print(s+"\t");
        }
        StdOut.println("(" + stack.size() + " left on stack)");
    }
}
