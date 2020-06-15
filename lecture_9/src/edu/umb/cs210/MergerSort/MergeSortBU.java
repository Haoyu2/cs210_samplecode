package edu.umb.cs210.MergerSort;

import static edu.umb.cs210.Sorted.isSorted;

public class MergeSortBU {

//  2  1  4  5  7 6
//  1  2  4 5   6 7
    // 1 2 4 5 6 7

    public static void sort(Comparable[] a) {
        int n = a.length;
        Comparable[] aux = new Comparable[n];
        for (int len = 1; len < n; len *= 2) {
            for (int lo = 0; lo < n-len; lo += len+len) {
                int mid  = lo+len-1;
                int hi = Math.min(lo+len+len-1, n-1);
                merge(a, aux, lo, mid, hi);
            }
        }
    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];  // this copying is unneccessary
            else if (j > hi)               a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i])<0) a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }

    }
}
