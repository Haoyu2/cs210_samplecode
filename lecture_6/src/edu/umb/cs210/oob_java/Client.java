package edu.umb.cs210.oob_java;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();

        String id = "001";
        Student student1 = new Student(id);

        System.out.println(student.getName());

        student1.setName("Mike Ross");

        System.out.println(student1.getName());

        System.out.println(student1.toString());

        System.out.println(id.charAt(0));

        System.out.println("Old hashcode" + id.hashCode());
        id = id.replace('0','1');

        System.out.println(id);
        System.out.println("Old hashcode" + id.hashCode());

        StringBuilder st = new StringBuilder("001");
        st.replace( 0,'1',"11");
        System.out.println(st);

        System.out.println(String.format("This is id of: %s %x %e",id, 17, 0.1));

    }
}
