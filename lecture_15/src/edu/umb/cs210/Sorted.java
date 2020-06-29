package edu.umb.cs210;

public class Sorted {
    public static boolean isSorted(Comparable[] a, int start, int end){
        for (int i =start; i < end-1; i++) {
            if(a[i].compareTo(a[i+1])>0)
                return false;
        }
        return true;
    }
}
