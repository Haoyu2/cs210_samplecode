import com.sun.jdi.event.EventIterator;
import stdlib.StdOut;

import java.util.Iterator;

//This class will print out all the even number smaller than a given integer
public class EvenNumbersWithin implements Iterable<Integer> {

    int num;

    public EvenNumbersWithin(int num) {
        this.num = num;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new EvenIterator();
    }

    class EvenIterator implements Iterator<Integer> {

        int cur = 0;

        @Override
        public boolean hasNext() {
            return cur <= num;
        }

        @Override
        public Integer next() {
            int val = cur;
            cur += 2;
            return val;
        }
    }

    public static void main(String[] args) {
        EvenNumbersWithin even = new EvenNumbersWithin(10);
        for (int i : even)  StdOut.println(i);

    }

}
