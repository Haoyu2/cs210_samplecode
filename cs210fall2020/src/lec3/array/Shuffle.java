/*
 *   Algorithm: Shuffle the array a.
 *      •Consider each index i from 0 to a.length.
 *      •Calculate a random index r between i and a.length.
 *      •Exchange a[i] with a[r]
 *
 *
 *
 *
 *   Justification:
 *      •   Uses only exchanges, so the result array  after the shuffle
 *          is a permutation of a.
 *
 *      •   N−i equally likely values for a[i].
 *      •   Possible results N×(N−1)×(N−1)... ×2×1 = N! is the total number of permutations
 *
 *   Performance: This algorithm is linear which is best deal it can get (every entry will have to be
 *                  accessed once)
 *
 *
 *
 * */

package lec3.array;

public class Shuffle {
    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int r = i + (int) (Math.random() * (arr.length - i));
            int t = arr[r];
            arr[r] = arr[i];
            arr[i] = t;
        }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + "\t");
        System.out.println();

    }

    public static void main(String[] args) {

        int[] a;
        a = new int[1];
        a[0] = 1;
//        each we use array, we have to be careful about the index range, it can crash your program


        int[][][] b = new int[1][2][3];
        System.out.println(b.length);
        System.out.println(b[0].length);


        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        shuffle(arr);
    }
}
