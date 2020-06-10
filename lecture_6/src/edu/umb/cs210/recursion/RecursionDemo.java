package edu.umb.cs210.recursion;

public class RecursionDemo {
    static long factorial(int n)
    {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    static long factorialIter(int n)
    {
        long fac=1;
        for (int i = 2; i < n + 1; ++i)
        {
            fac *= i;
        }
        return fac;
    }

    static int gcd(int q, int p)
    {
        if(p==0) return q;
        return gcd(p, q % p);
    }


    //  1 2 3 4 5 6 7
    //  0 1 2 3 4 5 6 index
    //

    // mid 3 = start + (end- start) / 2


    //
    static int binarySearch(int[] a,int start, int end, int num)
    {
        int mid = start + (int) ((end- start) / 2);
        if (a[mid] == num) return mid;
        if (a[mid] < num)
            return binarySearch(a, mid+1, end, num);
        else
            return binarySearch(a, start, mid-1,num);
    }


    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        System.out.println(factorialIter(3));
//
//        System.out.println(gcd(12,15));

//        System.out.println((int)1.5);
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(a,0,a.length -1, 8));











    }
}
