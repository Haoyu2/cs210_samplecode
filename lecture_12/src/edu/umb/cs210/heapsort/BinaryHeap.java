package edu.umb.cs210.heapsort;

import edu.umb.cs210.Swap;

import java.util.Comparator;

public class BinaryHeap<Key extends Comparable<Key>> {
    private Key[] pq;
    private int n;

    public BinaryHeap(int cap) {
        this.pq = (Key[]) new Comparable[cap+1];
        this.n = 0;
    }

    public void insert(Key key){
        pq[n] = key;
        swim(n);
        n++;

    }

    public Key del(){
        Key item = pq[1];
        Swap.swap(pq,1, n-1);
        sink(1);
        n--;
        return item;
    }
    public void swim(int k){


        while(k>1 && pq[k].compareTo(pq[k/2])>0){
            Swap.swap(pq,k,k/2);
            k /=2;
        }
    }

    public void sink(int k){

        while ( 2*k<n ){
            int j=2*k;
            if(j<n && pq[j].compareTo(pq[j+1])<0) j++;
            if(pq[k].compareTo(pq[j])>0) break;
            Swap.swap(pq,k,j);
            k =j;

        }
    }

    public static void main(String[] args) {

        BinaryHeap pq = new BinaryHeap(10);
        int a[] = {3,1,4,2};

        for (int i = 0; i < a.length; i++) {
            pq.insert(a[i]);
        }
        System.out.println(pq.del());
        System.out.println(pq.del());
    }
}
