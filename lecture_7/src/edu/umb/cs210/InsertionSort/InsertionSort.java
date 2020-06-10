package edu.umb.cs210.InsertionSort;

import edu.umb.cs210.SelectionSort.SelectionSort;
import edu.umb.cs210.Student;

import java.util.Arrays;
import java.util.Comparator;

public class InsertionSort {

    //  1 2 3 4
    //

    // 4 3 2 1

    // 3 4 2 1
        // 3 2 4 1
        // 2 3 4 1

    //  3 2 1 5
    //  2 3 1 5  1
    //2 1 3 5     2
    //1 2 3 5//
    //  1 2 3 5     3


    public static void sort(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {

            for (int j = i; j > 0; j--) {
                if (a[j].compareTo(a[j - 1]) < 0) {
                    Comparable temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }else break;
            }
        }
    }

    public static void sort(Comparable[] a, Comparator comparator) {

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (comparator.compare(a[j], a[j - 1]) < 0) {
                    Comparable temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }else
                    break;
            }
        }
    }


    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004","John Doe", 18),
                new Student("002","Mike Ros", 17),
                new Student("001","Paul Ron", 28),
                new Student("003","Camo Tug",20),
        };

        InsertionSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        InsertionSort.sort(students,new Student.IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println();
        InsertionSort.sort(students,new Student.IDComparator().reversed());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

}

