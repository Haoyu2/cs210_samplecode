package edu.umb.cs210.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackArrayFixedSize<T> implements Iterable<T> {
    private T[] arr;
    private int N;

    public StackArrayFixedSize(int size) {
        this.arr = (T[]) new Object[size];
        this.N = 0;
    }

    public void push(T item) {
        arr[N++] = item;
    }

    public T pop() {
        if (N == 0) throw new ArrayIndexOutOfBoundsException();
        return arr[N--];
    }

    @Override
    public Iterator iterator() {
        return new SAFIterator();
    }

    public class SAFIterator<T> implements Iterator<T> {
        private int i = N - 1;

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
        String[] ss = new String[]{"hello", "world", "nice"};
        StackArrayFixedSize<String> stack = new StackArrayFixedSize(10);
        for (String s : ss) {
            stack.push(s);
        }
        for (String s : stack) {
            System.out.println(s);
        }
        int[] aa = new int[]{1,2, 3};
        StackArrayFixedSize<Integer> stack1 = new StackArrayFixedSize(10);
        for (int a : aa) {
            stack1.push(a);
        }
        for (int a : stack1) {
            System.out.println(a);
        }
    }
}
