package lec13.apos;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
/*
*
*       0   1   2   3   4
* a     3   2   4   0   1     (03)(124)
*
* a^-1  3   4   1   0   2    (03)(124)
*
* a^(-1) * a  = identity array
*       0   1   2   3   4
*
* permuation multi
*
* b     2   3   0   1   4   (02)(13)4
*
* a*b
*       3   2   4   0   1
*       1   0   4   2   3
*
*
* a*b^-1  then this inversions of this product is the Kendall tau distance
*
* */

public class PermuOper {
    // Create an identity array which the values are equal the indexes
    public static int[] indentity(int len){
        int[] ind = new int[len];
        for (int i = 0; i < len; i++) {
            ind[i] = i;
        }
        return ind;
    }
    public static int[] permute(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        StdRandom.shuffle(b);
        return b;
    }

    public static int[] per(int len){
        int[] a = indentity(len);
        StdRandom.shuffle(a);
        return a;
    }

    public static void main(String[] args) {
        int[] a = indentity(5);
        int[] b = permute(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(per(6)));
    }
}
