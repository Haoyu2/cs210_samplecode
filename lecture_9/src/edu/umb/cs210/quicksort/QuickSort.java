package edu.umb.cs210.quicksort;

import edu.princeton.cs.algs4.StdRandom;
import edu.umb.cs210.Swap;

public class QuickSort {

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int start, int end) {
        if (start >= end) return;
        int j = partition(a, start, end);
        sort(a, start, j - 1);
        sort(a, j + 1, end);

    }

// partition will make the jth item in the right place

    public static int partition(Comparable[] a, int start, int end) {

        Comparable val = a[start];

        int i = start + 1, j = end;
        while (true) {
            while (i < end && a[i].compareTo(val) < 0) i++;
            while (j>0 && a[j].compareTo(val) > 0) j--;
            if ( i >= j) break;
            Swap.swap(a, i, j);
        }
        Swap.swap(a, start, j);
        return j;
    }


    public static void main(String[] args) {
        Integer[] a = new Integer[]{-1, 2, 0, 1,10,20,9,8};

        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

//        System.out.println(partition(a, 0, a.length - 1));

    }

}
