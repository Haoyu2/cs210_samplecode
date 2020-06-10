package edu.umb.cs210;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static int binarySearch(Comparable[] a, Comparable item)
    {
        if(!isSorted(a)) Arrays.sort(a);
        return helper(a,0,a.length-1, item);
    }

    public static int binarySearch(Comparable[] a, Comparable item, Comparator comparator)
    {
        if(!isSorted(a)) Arrays.sort(a,comparator);
        return helper(a,0,a.length-1, item, comparator);
    }


    static int helper(Comparable[] a, int start, int end, Comparable item) {
        int mid = start + (int) ((end - start) / 2);
        if (start > end) return -1;
        if (a[mid].compareTo(item) == 0) return mid;
        if (a[mid].compareTo(item) < 0)
            return helper(a, mid + 1, end, item);
        else
            return helper(a, start, mid - 1, item);
    }

    static int helper(Comparable[] a, int start, int end, Comparable item, Comparator comparator) {
        int mid = start + (int) ((end - start) / 2);
        if (start > end) return -1;
        if (comparator.compare(a[mid], item) == 0) return mid;
        if (comparator.compare(a[mid], item) < 0)
            return helper(a, mid + 1, end, item,comparator);
        else
            return helper(a, start, mid - 1, item,comparator);
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 0; i < a.length -1; i++) {
            if (a[i].compareTo(a[i+1]) > 0) return false;
        }
        return true;
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

        System.out.println(binarySearch(students, student) + "\t"+ student.toString());

        Arrays.sort(students, new Student.IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println(binarySearch(students, student, new Student.IDComparator())
                + "\t"+ student.toString());
    }
}
