package edu.umb.cs210.mergerSort;

import java.util.Comparator;

public class MergeSort {

    public static Comparable[] merge_demo(Comparable[] a, Comparable[] b)
    {
        Comparable[] c = new Integer[a.length+b.length];

        int i=0, j=0;
        for (int k = 0; k < c.length; k++) {

            if (i>= a.length) c[k] = b[j++];  // all the elements in a have been set
            else if (j>=b.length) c[k] = a[i++];// all the elements in b have been set
            else
            c[k] = a[i].compareTo(b[j])<0 ? a[i++] : b[j++];
        }
        return c;
    }


    public static void main(String[] args) {
        Integer[] a = new  Integer[]{ 4,5,6};
        Integer[] b = new  Integer[]{ 1,2,3};

        Comparable[] c =  merge_demo(a,b);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].toString());
        }

        Integer[] cc= new Integer[]{ 4,5,6 , 1, 2,3 };

    }
}
