package edu.umb.cs210.iter;

import java.lang.Integer;
import java.util.Iterator;
import java.util.NoSuchElementException;
// Range(0, 10,2) 0, 2,...,10

public class Range implements Iterable<Integer> {
    private int start, end, step;

    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Iterator iterator() {
        return new RangeIterator();
    }

    class RangeIterator<Integer> implements Iterator<java.lang.Integer> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return i <= end;
        }

        @Override
        public java.lang.Integer next() {
            if (!hasNext()) throw new NoSuchElementException();
            int j = i;
            i += step;// i = i + step;
            return j;
        }
    }

    public static void main(String[] args) {
        Range range = new Range(0, 10, 4);
        for (int i : range) {
            System.out.println(i);
        }
    }
}
