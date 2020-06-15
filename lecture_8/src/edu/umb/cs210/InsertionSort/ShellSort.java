package edu.umb.cs210.InsertionSort;

import edu.umb.cs210.Student;

import java.util.Comparator;

public class ShellSort {

    public static void sort(Comparable arr[]) {

        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ...
        int h = 1;
        while (h < arr.length / 3) h = 3 * h + 1;
        Comparable temp;
        while (h > 0) {
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j >= h &&
                        arr[j].compareTo(arr[j - h]) < 0; j -= h) {
                    temp = arr[j - h];
                    arr[j - h] = arr[j];
                    arr[j] = temp;
                }

            }
            h /= 3;
        }
    }

    public static void sort(Object arr[], Comparator comparator) {

        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ...
        int h = 1;
        while (h < arr.length / 3) h = 3 * h + 1;
        while (h > 0) {
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j >= h &&
                        comparator.compare(arr[j - h], arr[j]) > 0; j -= h) {
                    Object temp = arr[j - h];
                    arr[j - h] = arr[j];
                    arr[j] = temp;
                }

            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004", "John Doe", 18),
                new Student("002", "Mike Ros", 17),
                new Student("001", "Paul Ron", 28),
                new Student("003", "Camo Tug", 20),
        };

        ShellSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println();
        ShellSort.sort(students, new Student.IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        System.out.println();
        ShellSort.sort(students, new Student.IDComparator().reversed());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        Integer[] a = new Integer[]{5, 3, 7, 8, 1, 2, 6};


        ShellSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
