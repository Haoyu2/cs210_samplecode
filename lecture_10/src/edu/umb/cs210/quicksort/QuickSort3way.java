package edu.umb.cs210.quicksort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import edu.umb.cs210.InsertionSort.InsertionSort;
import edu.umb.cs210.Median;
import edu.umb.cs210.Swap;

public class QuickSort3way {
    private static final int CUTOFF = 8;

    public static void sort(Comparable[] a) {
//        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);

    }

    private static void sort(Comparable[] a, int start, int end) {

        if(start>=end) return;
        Swap.swap(a, start, Median.median(a, start, end));

        int i = start, left = start, right = end;

        while (i <= right) {
            if (a[left].compareTo(a[i]) == 0) i++;
            if (a[left].compareTo(a[i]) > 0)
                Swap.swap(a, i++, left++);
            else Swap.swap(a, i, right--);
        }
        sort(a, start, left - 1);
        sort(a, right + 1, end);

    }

    public static void main(String[] args) {

//        Integer[] a = new Integer[]{-1, 2, 0, 1,1,1,1,1,4,5,10,6,7,12,15,26,77,88};
//        QuickSort3way.sort(a);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        testingSortSpeed();
    }

    static void testingSortSpeed() {
        int num = 100000;
        Integer[] a = new Integer[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }


        Stopwatch timer = new Stopwatch();
//        QuickSortX.sort(a);
//        StdOut.print(timer.elapsedTime() + "s\t");
//        timer = new Stopwatch();
//        sort(a);
//        StdOut.print(timer.elapsedTime() + "s\t");

        timer = new Stopwatch();
        QuickSort3Way.sort(a);
        StdOut.print(timer.elapsedTime() + "s\t");


    }
}
