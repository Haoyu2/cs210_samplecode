package edu.umb.cs210;

public class LinkedListStack<Type> {
    private Node top = null;
    private int n=0;

    private class Node {
        Type item;
        Node next;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Type item) {
        Node oldtop = top;
        top = new Node();
        top.item = item;
        top.next = oldtop;
        n++;
    }

    public Type pop() {
        Type item = top.item;
        top = top.next;
         if(n>0)   n--;
        return item;
    }

    public int getN() {
        return n;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{
                "That", "looks", "very", "good"
        };

        LinkedListStack stack = new LinkedListStack();
        for (String s : strings) {
            stack.push(s);
            System.out.print(s + "\t");
        }
        System.out.println();
        while (!stack.isEmpty())
            System.out.print(stack.pop() + "\t");
        System.out.println();

        double[] doubles = new double[]{1, 2, 3, 4, 5};

        for (double d : doubles) {
            stack.push(d);
            System.out.print(d + "\t");
        }
        System.out.println();
        while (!stack.isEmpty())
            System.out.print(stack.pop() + "\t");
    }
}
