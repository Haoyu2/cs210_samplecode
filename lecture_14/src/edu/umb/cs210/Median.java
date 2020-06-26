package edu.umb.cs210;

import edu.princeton.cs.algs4.StdRandom;

public class Median {

    public static int get(Comparable[] a, int start, int end) {
        int mid = start + (end - start) / 2;

        if (a[start].compareTo(a[mid]) < 0){
            // a[start] < a[mid]
            if(a[mid].compareTo(a[end])<0) return mid;
            else{
                // a[start] < a[mid]  a[end]<= a[mid]
                if(a[start].compareTo(a[end])>0)
                    return start;
                else
                    return end;
            }
        }
        else
        {
            // a[start] >= a[mid]
            if(a[end].compareTo(a[start])>0) return start;
            else{
                // a[start] >= a[mid]  a[start] >= a[end]
                if(a[mid].compareTo(a[end])>0)
                    return mid;
                else
                    return end;
            }


        }





//        return a[start].compareTo(a[mid]) < 0 ?
//
//                // a[start] < a[mid] <a[end]    a[start] < a[mid] a[end] < a[mid]
//                ((a[end].compareTo(a[mid])> 0) ? mid : (a[start].compareTo(a[end])) > 0 ? start : end) :
//
//        // a[start] > a[mid]     a[start] >= a[mid] a[start] >= a[end]
//                ((a[end].compareTo(a[start])> 0 ? start: (a[mid].compareTo())))

    }

    public static int median(Comparable[] a, int start, int end){
        int mid = start + (end - start) / 2, temp = start;


        // item0 item1 item2

        // this keeps a[mid] > a[start]
        if (a[start].compareTo(a[mid])>0){
            start = mid;
            mid = temp;
        }
        // item0 < item1    item2
        if (a[end].compareTo(a[mid])>0)
            return mid;
        // item0 < item1    item2 < item1
        else {
            if (a[start].compareTo(a[end])>0)
                return start;
            else return end;
        }
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
