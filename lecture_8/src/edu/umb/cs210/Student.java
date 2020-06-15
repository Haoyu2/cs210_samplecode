package edu.umb.cs210;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

// 1, this student(field) is less than that
    // 0, equal
    // -1, less

    @Override
    public int compareTo(Student that) {
        if (this.age < that.age) return -1;
        if (this.age > that.age) return 1;
        return 0;
    }

    public static class IDComparator implements Comparator<Student> {

        @Override
        public int compare(Student t1, Student t2) {


            return t1.id.compareTo(t2.id);
        }
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004", "John Doe", 18),
                new Student("002", "Mike Ros", 17),
                new Student("001", "Paul Ron", 28),
                new Student("003", "Camo Tug", 20),
        };

        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        Arrays.sort(students, new IDComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("a".compareTo("b"));
    }
}
