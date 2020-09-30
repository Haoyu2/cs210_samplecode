package lec5.recursion;

import edu.princeton.cs.algs4.StdOut;

public class FibonacciR
{
    public static long F(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n-1) + F(n-2);
    }
    public static void main(String[] args)
    {
        int n = 50;
        StdOut.println(F(n));
    }
}
