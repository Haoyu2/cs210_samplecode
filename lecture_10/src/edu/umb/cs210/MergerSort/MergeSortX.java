package edu.umb.cs210.MergerSort;

import edu.umb.cs210.InsertionSort.InsertionSort;
import edu.umb.cs210.Sorted;

public class MergeSortX {

    private static final int CUTOFF = 8;
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        System.arraycopy(a, 0, aux, 0, a.length);
        sort(a, aux,0, a.length-1 );


    }
    public static void sort(Comparable[] a, Comparable[] aux, int start, int end)
    {
        if(start >= end) return;
        int mid = start +  (end - start) / 2;
        if (end-start+1 <=CUTOFF){
            insertionSort(a, start, end);
            return;
        }
        sort(aux, a, start,mid);
        sort(aux,a, mid+1, end);
        if (a[mid+1].compareTo(a[mid]) >= 0)  return;
        merge(a,aux, start,mid,end);
    }



    public static void merge(Comparable[] a, Comparable[] aux, int start,int mid, int end) {

        int i = start, j = mid + 1;

        for (int k = start; k <= end; k++) {
            if (i > mid) a[k] = aux[j++];


                // all the elements on left side have set, then only left with
                // elements on the right side
            else if (j > end) a[k] = aux[i++];
            else a[k] = aux[i].compareTo(aux[j]) < 0 ? aux[i++] : aux[j++];
        }
    }



    public static void insertionSort(Comparable[] a, int start, int end) {
        for (int i = start; i <= end; i++)
            for (int j = i; j > start && (a[j].compareTo(a[j - 1]) < 0); j--) {
                Comparable temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
    }



    public static void main(String[] args) {

        Integer[] cc = new Integer[]{4, 5, 6, 1, 2, 3};

        sort(cc);
        for (int i = 0; i < cc.length; i++) {
            System.out.println(cc[i]);
        }

    }
}
