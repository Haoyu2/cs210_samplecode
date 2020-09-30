package lec5.recursion;

import edu.princeton.cs.algs4.StdOut;

/*
 *
 *   Recursion involves a recurrence relation and a stopping condition
 *
 *  2 : 10
 *  3 : 11
 *
 *  A: A'b == A' + 'b'
 *
 *
 *
 *
 *
 *
 * */



public class Binary
{
    //    the N cannot be 0 or negative
    public static String convert(int N)
    {
        if (N == 1) return "1";
        return convert(N/2) + (N % 2);
    }
    public static void main(String[] args)
    {
        int N = 3;
        StdOut.println(convert(N));
    }
}
