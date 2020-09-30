package lec5.recursion;

/*
*
*   For ruler(4)
*               times of computation
*   ruler(0): 2^(4-0)
*   ruler(1): 2^(4-1)
*
*
*
*
* */


import edu.princeton.cs.algs4.StdOut;

public class Ruler
{
    public static String ruler(int n)
    {
        if (n == 0) return " ";
        return ruler(n-1) + n + ruler(n-1);
    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(ruler(n));
    }
}