package edu.umb.cs210.heapsort;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class HeapSortedArray<K extends Comparable<K>> {
    private K[] keys;
    private int size;
    public HeapSortedArray(int capacity) {
        this.keys = (K[]) (new Comparable[capacity]);
//        this.keys = new K[size];
        this.size = 0;
    }


    //[1,2,3, 5,6]  4
    //[1,2,3, 4,6]  4

    public void insert(K key){

        int i = size-1;
        while ( i>=0 && keys[i].compareTo(key)>0){
            keys[i+1] = keys[i];
            i--;
        }

        keys[i+1] = key;
        size++;

    }

    public K delete(){
        K key = keys[size-1];
        keys[size-1] = null;
        size--;
        return key;
    }














    public static void main(String[] args) {

        HeapSortedArray<Integer> pq = new HeapSortedArray<>(10);
        int a[] = {3,1,4,2};

        for (int i = 0; i < a.length; i++) {
            pq.insert(a[i]);
        }






        System.out.println(pq.delete());
        System.out.println(pq.delete());
    }
}
