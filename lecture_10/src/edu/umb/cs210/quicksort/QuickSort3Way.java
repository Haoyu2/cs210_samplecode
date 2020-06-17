package edu.umb.cs210.quicksort;

import edu.princeton.cs.algs4.StdRandom;
import edu.umb.cs210.InsertionSort.InsertionSort;
import edu.umb.cs210.Median;
import edu.umb.cs210.Swap;

import javax.print.attribute.standard.Media;

public class QuickSort3Way {
    //  2 1 3 2 2 4 5
    //  1   2 2 2 4 5 3

    // left points left the equal item
    // right points the right equal item
    // i points the current right of the equal pivotal item

    // left i 2 2    item 1

    //        1 2 2

    // left i 2 2    item 3       1  4

    //        1 2 2     4         1  3

    //       1  2  2  1        4 3
    //       1  1 2  2  4 3

    public static void sort(Comparable[] a) {

        sort(a, 0, a.length - 1);

    }




    public static void sort(Comparable[] a, int start, int end) {

        if (start >= end) return;
        int median = Median.median(a, start, end);
        Swap.swap(a, start, median);

        int i = start, left = start, right = end;

        while (i <= right) {
            if (a[left].compareTo(a[i]) == 0) i++;
            else if (a[i].compareTo(a[left]) < 0)
                Swap.swap(a, left++, i++);
            else
                Swap.swap(a, i, right--);
        }
        sort(a, start, left - 1);
        sort(a, right + 1, end);
    }

    public static void main(String[] args) {

        int num = 10;
        Integer[] a = new Integer[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        StdRandom.shuffle(a);
        QuickSort3Way.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}



































