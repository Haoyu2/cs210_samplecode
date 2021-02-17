// Accepts k (int) as command-line argument and a sequence of integers from standard input; and
// writes the kth integer from the end to standard output.

import dsa.LinkedQueue;
import stdlib.StdIn;
import stdlib.StdOut;

public class KthFromLast {
    // Entry point.
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
        while (!StdIn.isEmpty()) {
            queue.enqueue(StdIn.readInt());
        }
        int n = queue.size();
        for (int i = 1; i <= n - k; i++) {
            queue.dequeue();
        }
        StdOut.println(queue.peek());
    }
}