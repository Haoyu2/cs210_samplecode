package edu.umb.cs210.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    static int binarySearch(Comparable[] a, int start, int end, Comparable num) {
        int mid = start + (int) ((end - start) / 2);
        if (start > end) return -1;
        if (a[mid].compareTo(num) == 0) return mid;
        if (a[mid].compareTo(num) < 0)
            return binarySearch(a, mid + 1, end, num);
        else
            return binarySearch(a, start, mid - 1, num);
    }

    static int binarySearch(Comparable[] a, int start, int end, Comparable num, Comparator comparator) {
        int mid = start + (int) ((end - start) / 2);
        if (start > end) return -1;
        if (comparator.compare(a[mid], num) == 0) return mid;
        if (comparator.compare(a[mid], num) < 0)
            return binarySearch(a, mid + 1, end, num,comparator);
        else
            return binarySearch(a, start, mid - 1, num,comparator);
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004", "John Doe", 18),
                new Student("002", "Mike Ros", 17),
                new Student("001", "Paul Ron", 28),
                new Student("003", "Camo Tug", 20)
        };

        Student student = new Student("003", "Paul Ron", 28);
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println(binarySearch(students, 0, students.length - 1, students[3]));

        Arrays.sort(students, new Student.IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println(binarySearch(students, 0, students.length - 1, student, new Student.IDComparator()));
    }
}
