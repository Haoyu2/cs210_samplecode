package edu.umb.cs210.MergerSort;

import java.util.Comparator;

public class MergeSort {


    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        System.arraycopy(a, 0, aux, 0, a.length);
        sort(a, aux,0, a.length-1 );


    }
    public static void sort(Comparable[] a, Comparable[] aux, int start, int end)
    {
        if(start >= end) return;
        int mid = start +  (end - start) / 2;
        sort(a, aux, start,mid);
        sort(a,aux, mid+1, end);
        merge(a,aux, start,mid,end);
    }

    public static Comparable[] merge_demo(Comparable[] a, Comparable[] b) {
        Comparable[] c = new Integer[a.length + b.length];

        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {

            if (i >= a.length) c[k] = b[j++];  // all the elements in a have been set
            else if (j >= b.length) c[k] = a[i++];// all the elements in b have been set
            else
                c[k] = a[i].compareTo(b[j]) < 0 ? a[i++] : b[j++];
        }
        return c;
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

    public static void merge(Comparable[] a, int start, int end) {
        Comparable[] aux = new Comparable[a.length];
        System.arraycopy(a, 0, aux, 0, a.length);

        int mid = start + (end - start) / 2;
        int i = start, j = mid + 1;

        for (int k = 0; k < a.length; k++) {
            if (i > mid) a[k] = aux[j++];
                // all the elements on left side have set, then only left with
                // elements on the right side
            else if (j > end) a[k] = aux[i++];
            else a[k] = aux[i].compareTo(aux[j]) < 0 ? aux[i++] : aux[j++];
        }
    }


    public static void main(String[] args) {
//        Integer[] a = new  Integer[]{ 4,5,6};
//        Integer[] b = new  Integer[]{ 1,2,3};

//        Comparable[] c =  merge_demo(a,b);
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i].toString());
//        }

        Integer[] cc = new Integer[]{4, 5, 6, 1, 2, 3};
//        Integer[] cc = new Integer[]{2,1};


//        merge(cc, 0, 2,cc.length - 1);
        sort(cc);
        for (int i = 0; i < cc.length; i++) {
            System.out.println(cc[i]);
        }

    }
}
