package edu.umb.cs210.InsertionSort;



import edu.umb.cs210.Student;

import java.util.Comparator;

public class InsertionSort {
    public static void sort(Comparable arr[]) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 &&
                    arr[j].compareTo(arr[j - 1]) < 0; j--) {
                Comparable temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }

        }
    }

    public static void sort(Object arr[], Comparator comparator) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 &&
                    comparator.compare(arr[j - 1], arr[j]) > 0; j--) {
                Object temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }

        }
    }
    public static void sort(Comparable[] a, int start, int end) {
        for (int i = start; i <= end; i++)
            for (int j = i; j > start && (a[j].compareTo(a[j - 1]) < 0); j--) {
                Comparable temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
    }
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004", "John Doe", 18),
                new Student("002", "Mike Ros", 17),
                new Student("001", "Paul Ron", 28),
                new Student("003", "Camo Tug", 20),
        };

        InsertionSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println();
        InsertionSort.sort(students, new Student.IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        System.out.println();
        InsertionSort.sort(students, new Student.IDComparator().reversed());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        Integer[] a = new Integer[]{5,3,7,8,1,2,6};


        InsertionSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
}
