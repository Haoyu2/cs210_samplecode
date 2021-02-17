import stdlib.StdOut;

import java.util.Arrays;

public class GenericsDemo <K> {
    private K item; // first usage, generic vairable
    private K arr[]; // second, generic array

    public GenericsDemo(K item) {
        this.item = item;
    }

    public GenericsDemo(K m, int n) {
        this.item = m;
//        this.arr = new K[n]; // this is wrong, java can not create generic array directly
        this.arr = (K[]) new Object[n]; // Type casting of an object array is the right way
    }

    @Override
    public String toString() {
        return "GenericsDemo{" +
                "item=" + item.toString() +
                ",  type=" + item.getClass().getName() +
                '}';
    }

    public K[] getArr() {
        return arr;
    }

    public static void demo1(){
        GenericsDemo demo1 = new GenericsDemo(1);
        GenericsDemo demo2 = new GenericsDemo(1.1);
        GenericsDemo demo3 = new GenericsDemo("one");
        StdOut.println(demo1);
        StdOut.println(demo2);
        StdOut.println(demo3);
    }

    public static void demo2(){
        // This is bad
        GenericsDemo demo1 = new GenericsDemo(0,2);
        demo1.getArr()[0] = 1;
        demo1.getArr()[1] = "hello";
        StdOut.println(demo1.getArr().toString());
        StdOut.println(Arrays.toString(demo1.getArr()));

//         This is good code
        GenericsDemo demo2 = new GenericsDemo<String>("hello",2);
        demo2.getArr()[0] = "1";
        demo2.getArr()[1] = "hello";
        StdOut.println(demo2.getArr().toString());
        StdOut.println(Arrays.toString(demo2.getArr()));
    }


    public static void main(String[] args) {

//        demo1();
        demo2();




    }
}
