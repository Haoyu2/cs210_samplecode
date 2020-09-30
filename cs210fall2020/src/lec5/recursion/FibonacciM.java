package lec5.recursion;

import edu.princeton.cs.algs4.StdOut;

public class FibonacciM
{
    static long[] memo = new long[10000];
    public static long F(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo[n] == 0)
            memo[n] = F(n-1) + F(n-2);
        return memo[n];
    }
    public static void main(String[] args)
    {
        int n = 1000;
        StdOut.println(F(n));
    }
}
