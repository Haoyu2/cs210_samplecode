/*
*       10 GHz
*   1. GHz = 10^9 CPU's clock frequency (1 billion)
*
* *    Suppose A typical laptop do a computation 1 billion/s
*      For factor 1 billion in a quadratic algorithm is going to need
*      1 billion seconds.
*      1 year = 31,536,000 seconds
*      1 billion / 31,536,000 seconds =  31.7  year
*
*      sqare root algorithm will be sqrt(1 billion) = 31623 seconds = 9 hours
*
*       if integer is bigger than million, or more than 12 digits, the running time of different
*       algorithm will be stark, and this is also the motivation to study the data structures and
*       algorithms
*
*      200-digit integer
*
*
* *
*
* */





package lec2.ifwhilefor;

import javax.swing.*;

public class Factors
{
    public static void main(String[] args)
    {
        if (args.length==0) args = new String[]{"11111111111111111"};
        long n = Long.parseLong(args[0]);
//        i^2 > n i will not be n's factor
        for ( int i = 2; i <= n / i; i++)
        {
            while (n % i == 0)
            {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) System.out.println(n);
        else System.out.println();
    }
}