package edu.umb.cs210.linkedlist;

public class Node <T> {
    public T item;
    public Node next;

    public Node(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Node node = new Node("hello");
        if(node.next==null)
            System.out.println(node.item);
    }
}
