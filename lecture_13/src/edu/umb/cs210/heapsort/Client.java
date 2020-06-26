package edu.umb.cs210.heapsort;

import edu.princeton.cs.algs4.MinPQ;

public class Client {

    public static void main(String[] args) {
        MinPQ<Integer> pq = new MinPQ<>();

        int a[] = {3,1,4,2};

        for (int i = 0; i < a.length; i++) {
            pq.insert(a[i]);
        }

        System.out.println(pq.delMin());
        System.out.println(pq.delMin());

    }
}
