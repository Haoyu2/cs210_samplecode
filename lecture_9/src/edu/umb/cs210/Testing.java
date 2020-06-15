package edu.umb.cs210;

import edu.princeton.cs.algs4.*;
import edu.umb.cs210.InsertionSort.InsertionSort;
import edu.umb.cs210.InsertionSort.ShellSort;

import edu.umb.cs210.MergerSort.MergeSort;
import edu.umb.cs210.MergerSort.MergeSortBU;
import edu.umb.cs210.MergerSort.MergeSortX;
import edu.umb.cs210.SelectionSort.SelectionSort;



public class Testing {
    static String[] file = new String[]{
            "Data/tinyW.txt",
            "Data/16Kints.txt",
            "Data/32Kints.txt",
            "Data/largeW.txt",
            "Data/largeT.txt",
    } ;


    public static void test1(){
        In in = new In(file[2]);
        String[] a = in.readAllStrings();
        System.out.println(a.length);
        System.out.println("Selection\tInsertion\tShell");
        Stopwatch timer = new Stopwatch();
        SelectionSort.sort(a);
        StdOut.print(timer.elapsedTime() + "s\t\t");

        StdRandom.shuffle(a);
        timer = new Stopwatch();
        InsertionSort.sort(a);
        StdOut.print(timer.elapsedTime() + "s\t\t");


        StdRandom.shuffle(a);
        timer = new Stopwatch();
        ShellSort.sort(a);
        StdOut.print(timer.elapsedTime() + "s\t");
        System.out.println();
    }

    public static void test2(){
        In in = new In(file[3]);
        String[] a = in.readAllStrings();
        int len = 50000;
        String[] b = new String[len];
        System.arraycopy(a,0,b,0,len);
        System.out.println("Array's length: " + b.length);
        System.out.println("Insertion\tShell");


        Stopwatch timer = new Stopwatch();


        InsertionSort.sort(b);
        StdOut.print(timer.elapsedTime() + "s\t\t");
//        Shuffle.knuth(a);
        timer = new Stopwatch();
        ShellSort.sort(b);
        StdOut.print(timer.elapsedTime() + "s\t");
        System.out.println();
    }


    public static void test3(){
        In in = new In(file[4]);
        String[] a = in.readAllStrings();

        int len = 10000000;
        String[] b = new String[len];
        System.arraycopy(a,0,b,0,len);
        System.out.println("Array's length: " + b.length);
        System.out.println("Shell\tMergeSort");
        Stopwatch timer = new Stopwatch();

        timer = new Stopwatch();
        ShellSort.sort(b);
        StdOut.print(timer.elapsedTime() + "s\t\t");

        StdRandom.shuffle(a);
        timer = new Stopwatch();
        MergeSort.sort(b);
        StdOut.print(timer.elapsedTime() + "s\t");
        System.out.println();
    }

    public static void test4(){
        In in = new In(file[4]);
        String[] a = in.readAllStrings();

        int len = 10000000;
        String[] b = new String[len];
        System.arraycopy(a,0,b,0,len);
        System.out.println("Array's length: " + b.length);
        System.out.println("MergeSort\tMergeSortBU\tMergerSortX");
        Stopwatch timer = new Stopwatch();

        timer = new Stopwatch();
        MergeSort.sort(b);
        StdOut.print(timer.elapsedTime() + "s\t\t");
        StdRandom.shuffle(a);
        timer = new Stopwatch();
        MergeSortBU.sort(b);
        StdOut.print(timer.elapsedTime() + "s\t");

        StdRandom.shuffle(a);
        timer = new Stopwatch();
        MergeSortX.sort(b);
        StdOut.print(timer.elapsedTime() + "s\t");
        System.out.println();
    }


//    public static void test5(){
//        In in = new In(file[4]);
//        String[] a = in.readAllStrings();
//
//        int len = 10000000;
//        String[] b = new String[len];
//        System.arraycopy(a,0,b,0,len);
//        System.out.println("Array's length: " + b.length);
//        System.out.println("MergerSortX\tQuickSortX\tQuickSort\tQuickSort3Way");
//        Stopwatch timer = new Stopwatch();
//
////        timer = new Stopwatch();
////        MergeSort.sort(b);
////        StdOut.print(timer.elapsedTime() + "s\t\t");
////
//        timer = new Stopwatch();
//        MergeSortX.sort(b);
//        StdOut.print(timer.elapsedTime() + "s\t");
//
////        Shuffle.knuth(a);
//        timer = new Stopwatch();
//        QuickSortX.sort(b);
//        StdOut.print(timer.elapsedTime() + "s\t");
//        timer = new Stopwatch();
//        QuickSort.sort(b);
//        StdOut.print(timer.elapsedTime() + "s\t");
//
//        timer = new Stopwatch();
//        QuickSort3way.sort(b);
//        StdOut.print(timer.elapsedTime() + "s\t");
//        System.out.println();
//    }


    public static void main(String[] args) {

//        test1();
//        test2();
//        test3();
        test4();
//        test5();
    }
}
