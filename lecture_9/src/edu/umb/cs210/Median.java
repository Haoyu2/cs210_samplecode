package edu.umb.cs210;

import edu.princeton.cs.algs4.StdRandom;

public class Median {

    public static int get(Comparable[] a, int start, int end) {
        int mid = start + (end - start) / 2;
        return a[start].compareTo(a[mid]) > 0 ?
                (a[end].compareTo(a[start]) > 0 ? start : (a[mid].compareTo(a[end])) > 0 ? mid : end) :
                (a[end].compareTo(a[mid]) > 0 ? mid: (a[start].compareTo(a[end])) > 0 ? start : end);
    }

    public static int median(Comparable[] a, int start, int end){
        int mid = start + (end - start) / 2, temp = start;

        if (a[start].compareTo(a[mid])>0) {
            start = mid;
            mid = temp;
        }
        if (a[end].compareTo(a[mid])>=0) return mid;
        else if(a[end].compareTo(a[start])>=0) return end;
        else return start;

    }


    public static void main(String[] args) {
        Integer[] a = new Integer[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(100);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println(get(a,0,a.length-1));
        System.out.println(median(a,0,a.length-1));

    }

}
