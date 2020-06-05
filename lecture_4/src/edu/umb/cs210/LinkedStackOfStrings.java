package edu.umb.cs210;

public class LinkedStackOfStrings {
    private Node top = null;
    private class Node
    {
        String item;
        Node next;
    }

    public boolean isEmpty()
    { return top == null; }
    public void push(String item)
    {
        Node oldtop = top;
        top = new Node();
        top.item = item;
        top.next = oldtop;
    }
    public String pop()
    {
        String item = top.item;
        top = top.next;
        return item;
    }

    public static void main(String[] args) {



        String[] strings = new String[]{
                "That","looks","very","good"
        };

        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        for (String s: strings  ) {
            stack.push(s);
            System.out.print(s+"\t");
        }
        System.out.println();
        while (!stack.isEmpty())
            System.out.print(stack.pop()+"\t");

        double[] doubles = new double[]{1, 2, 3, 4, 5};
    }
}
