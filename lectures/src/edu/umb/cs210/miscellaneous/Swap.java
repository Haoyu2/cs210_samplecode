package edu.umb.cs210.miscellaneous;

public class Swap {
    public static void swap(Object[] a, int i, int j){
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
