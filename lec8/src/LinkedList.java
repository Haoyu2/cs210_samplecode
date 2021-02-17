import stdlib.StdOut;

public class LinkedList<Item> {
    // the fist and last pointers initially are all null pointers
    private Node first; //the first pointer which should always point to the first node in the linlkedlist
    private Node last;  // the last pointer should always point to the last non-null mode


    private class Node {
        Item item;
        Node next;

        public Node(Item item) {
            this.item = item;
        }
    }

    public void addFirst(Item item) {
        Node node = new Node(item);// the new first node
        node.next = first; // the old first node gonna be the second node
        if (first == null) last = node; // the whole linkledlist has only 1 node and first and last pointer
                                        // will points to the same node
        first = node; // make the first pointer points to the new first node

    }
// add item to the end of the linked list
    // when the linkedlist is empty the first pointer is null
    public void addLast(Item item) {
        if (first == null) {
            first = new Node(item);
            last = first;
        }
        else {
            last.next = new Node(item); // null pointer cannot reference anything, it will throw out runtime error
            last = last.next;
        }
    }



    public void iterate() {
        Node node = first;

        while (node != null) {
            StdOut.println(node.item.toString());
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.addFirst(1);
        l.addLast(2);
        l.addFirst(3);
        l.iterate();
    }
}
