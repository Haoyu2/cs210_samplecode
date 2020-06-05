package edu.umb.cs210;

public class LinkedListQueue <Type> {
    private Node front, end;
    private int n=0;

    public int getN() {
        return n;
    }

    private class Node
    {
        Type item;
        Node next;
    }

    public boolean isEmpty()
    { return front == null; }

    public void enqueue(Type item)
    {
        Node oldend = end;
        end = new Node();
        end.item = item;
        end.next = null;
        if (isEmpty()) front = end;
        else oldend.next = end;
        n++;
    }

    public Type dequeue()
    {
        Type item = front.item;
        front = front.next;
        if (isEmpty()) end = null;
        n--;
        return item;
    }
    public static void main(String[] args) {
        String[] strings = new String[]{
                "That", "looks", "very", "good"
        };

        LinkedListQueue queue = new LinkedListQueue();
        for (String s : strings) {
            queue.enqueue(s);
            System.out.print(s + "\t");
        }
        System.out.println();
        while (!queue.isEmpty())
            System.out.print(queue.dequeue() + "\t");
        System.out.println();

        double[] doubles = new double[]{1, 2, 3, 4, 5};

        for (double d : doubles) {
            queue.enqueue(d);
            System.out.print(d + "\t");
        }
        System.out.println();
        while (!queue.isEmpty())
            System.out.print(queue.dequeue() + "\t");
    }
}
