package edu.umb.cs210.InsertionSort;

import edu.princeton.cs.algs4.StdRandom;
import edu.umb.cs210.Student;

import java.util.Random;

public class ShellSort {
// for h=2
    //  4  2  3  5   1   8
    //  0     2      4

    //  1  2  3  5   4   8
// h seaquence  boost performance of Inserrtion Sort

//    when h = 1


    public static void sort(Comparable[] a) {


        int h = 1;
        while (h < a.length / 3) h = (h * 3) + 1;

        while (h > 0) {
            for (int i = 1; i < a.length; i++) {

                for (int j = i; j - h >= 0; j--) {
                    if (a[j].compareTo(a[j - h]) < 0) {
                        Comparable temp = a[j];
                        a[j] = a[j - h];
                        a[j - h] = temp;
                    } else break;
                }
            }
            h = h / 3;
        }

    }


    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004", "John Doe", 18),
                new Student("002", "Mike Ros", 17),
                new Student("001", "Paul Ron", 28),
                new Student("003", "Camo Tug", 20),
                new Student("008", "John Doe", 23),
                new Student("006", "Mike Ros", 27),
                new Student("007", "Paul Ron", 19),
                new Student("005", "Camo Tug", 30),
        };

        ShellSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        Integer[] a = new Integer[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        ShellSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
