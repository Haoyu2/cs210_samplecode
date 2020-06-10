package edu.umb.cs210.comparable;

import java.util.Arrays;

public class Course implements Comparable <Course> {
    private Student student;

    public Course(Student student) {
        this.student = student;
    }

    @Override
    public int compareTo(Course c) {
        return (new Student.IDComparator()).compare(this.student, c.student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "student=" + student.toString() +
                '}';
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("004","John Doe", 18),
                new Student("002","Mike Ros", 17),
                new Student("001","Paul Ron", 28),
                new Student("003","Camo Tug",20),
        };

        Course[] courses = new Course[]{
                new Course(students[0]),
                new Course(students[1]),
                new Course(students[2]),
                new Course(students[3]),
        };

        Arrays.sort(courses);
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }

    }
}
