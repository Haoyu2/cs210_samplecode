package edu.umb.cs210.SelectionSort;

import edu.umb.cs210.Student;

import java.util.Comparator;

public class SelectionSort {

    public static void sort(Comparable arr[]) {


        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0)
                    min = j;
            }
            Comparable temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void sort(Object arr[], Comparator comparator) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[j], arr[min]) < 0)
                    min = j;
            }
            Object temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004", "John Doe", 18),
                new Student("002", "Mike Ros", 17),
                new Student("001", "Paul Ron", 28),
                new Student("003", "Camo Tug", 20),
        };
        SelectionSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println();
        SelectionSort.sort(students, new Student.IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        System.out.println();
        SelectionSort.sort(students, new Student.IDComparator().reversed());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        Integer[] a = new Integer[]{5,3,7,8,1,2,6};


        SelectionSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
