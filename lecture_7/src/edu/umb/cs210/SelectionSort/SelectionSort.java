package edu.umb.cs210.SelectionSort;

import edu.umb.cs210.Student;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSort {

    //  3 2 1 5
    //  1 2 3 5   1
    //  1 2 3 5   2
    //  1 2 3 5   3
    //  1 2 3 5   4

    public static void sort(Comparable[] a)
    {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j <a.length ; j++) {
                if (a[j].compareTo(a[min]) < 0)
                    min = j;
            }

            Comparable temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }


    public static void sort(Comparable[] a, Comparator comparator)
    {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j <a.length ; j++) {
                if (comparator.compare(a[j], a[min]) < 0)
                    min = j;
            }

            Comparable temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004","John Doe", 18),
                new Student("002","Mike Ros", 17),
                new Student("001","Paul Ron", 28),
                new Student("003","Camo Tug",20),
        };

        SelectionSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        Arrays.sort(students,new Student.IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
