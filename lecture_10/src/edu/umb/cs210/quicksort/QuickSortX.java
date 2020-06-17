package edu.umb.cs210.quicksort;

import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import edu.umb.cs210.InsertionSort.InsertionSort;
import edu.umb.cs210.Median;
import edu.umb.cs210.Swap;

public class QuickSortX {
    private static final int CUTOFF = 8;

    public static void sort(Comparable[] a) {
//        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int start, int end) {
        if (start>=end) return;
        if (end - start <= CUTOFF) {
            insertionSort(a, start, end);
            return;
        }
        int j = partition(a, start, end);
        sort(a, start, j - 1);
        sort(a, j + 1, end);

    }


    public static void insertionSort(Comparable[] a, int start, int end) {
        for (int i = start; i <= end; i++)
            for (int j = i; j > start && (a[j].compareTo(a[j - 1]) < 0); j--) {
                Comparable temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
    }

// partition will make the jth item in the right place

    public static int partition(Comparable[] a, int start, int end) {


        Swap.swap(a,start, Median.median(a,start,end));
// to get the pivotal item close the median of the sub-array

        Comparable val = a[start];
        int i = start + 1, j = end;
        while (true) {

            while (i < end && a[i].compareTo(val) < 0) i++;
            while (a[j].compareTo(val) > 0) j--;
            if (i >= j) break;
            Swap.swap(a, i, j);
        }
        Swap.swap(a, start, j);
        return j;
    }





    public static void main(String[] args) {
//        Integer[] a = new Integer[]{-1, 2, 0, 1};
//        sort(a);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        testingSortSpeed();
    }

    static void testingSortSpeed(){
        int num = 10000000;
        Integer[] a = new Integer[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }


        StdRandom.shuffle(a);
        Stopwatch timer = new Stopwatch();
        sort(a);
        StdOut.print(timer.elapsedTime() + "s\t");
        timer = new Stopwatch();
        StdRandom.shuffle(a);

        Quick.sort(a);
        StdOut.print(timer.elapsedTime() + "s\t");
        StdRandom.shuffle(a);

        timer = new Stopwatch();
        QuickSort.sort(a);
        StdOut.print(timer.elapsedTime() + "s\t");




    }

}
