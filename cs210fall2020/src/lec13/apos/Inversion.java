package lec13.apos;

import java.util.Arrays;

/*
 *
 *
 *   a: 1 3  0  2     1:1, 3:2, 0:0, 2:0  total 3
 *
 *    1 3   0 2
 *    i     j
 * 1. doing the merge operation, if a[j] < a[i] then increment the counts of the inversions by 1
 * 2. after the merge operation the counts of inversions if gained, and the process is linear
 *
 * mid = 1
 *
 *
 *           i    inversions    a
 *   1 : 0   0    2          [0,..]
 *   1 : 2   0    2          [0,1,..]
 *   3 : 2   1    3          [0,1,2..]
 *   3 :          3          [0,1,2,3]
 *
 *
 *
 *
 *
 *
 *
 *
 * */


public class Inversion {
    public static long countB(int[] a) {
        long inversions = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) inversions++;
            }
        }
        return inversions;
    }

    private static long merge(int[] a, int[] aux, int lo, int mid, int hi) {
        long inversions = 0;

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        // merge back to a[]
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
                inversions += (mid - i + 1);
            } else a[k] = aux[i++];
        }
        return inversions;
    }

    public static long countBU(int[] a) {
        int N = a.length;
        int[] b = new int[a.length];// b is for preserver the original array order
        int[] aux = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        int count = 0, mid, hi;
        for (int i = 1; i < b.length; i += i) {
            for (int j = 0; j < b.length - i; j += (i + i)) {
                mid = j + i - 1;
                hi = Math.min(b.length - 1, j + i + i - 1);
                if (b[mid] <=b[mid+1]) continue;
                long k = merge(b, aux, j, mid, hi);
                count += k;
            }


        }
        System.out.println(Arrays.toString(b));
        return count;
    }


    public static void main(String[] args) {
        int[] a = PermuOper.per(20);
        System.out.println(Arrays.toString(a));
        System.out.println(countB(a));

        System.out.println(countBU(a));
        System.out.println(Inversions.count(a));
    }
}
