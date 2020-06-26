package edu.umb.cs210.heapsort;

import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int num = 10;
        Integer[] a = new Integer[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(100);
        }
        System.out.println(Arrays.toString(a));
        Heap.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
