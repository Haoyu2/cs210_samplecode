package edu.umb.cs210.oob_java;

public class Student {
    private String id;
    private String name;

    public Student() {
        this.id = "000";
        this.name= "Jone Doe";
        System.out.println("no args constructor called");
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id) {
        this.id = id;
        System.out.println("Student id is set");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
