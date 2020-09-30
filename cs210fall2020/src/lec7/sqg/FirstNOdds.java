package lec7.sqg;

import java.util.Iterator;

public class FirstNOdds implements Iterable<Integer> {
    int N;

    public FirstNOdds(int n) {
        N = n;
    }

    @Override
    public Iterator iterator() {
        return new FNOI();
    }
    private class FNOI implements Iterator<Integer>{

        int n = N, cur = 1;
        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public Integer next() {
            int res = cur;
            cur += 2;
            n--;
            return res;
        }
    }

    public static void main(String[] args) {
        FirstNOdds f5o = new FirstNOdds(5);
        for (int i : f5o) {
            System.out.println(i);
        }
    }

}
