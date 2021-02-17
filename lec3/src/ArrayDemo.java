


public class ArrayDemo {

    public static void main(String[] args) {

        double[] a; // declaration (create the varibale a)
        a = new double[10]; // initialization  assign memory for a to hold 10 doubles
        for (int i = 0; i < a.length; i++){

            a[i] = i;
//            System.out.println(a[i]);
        }


        double[] b = new double[a.length];
        b = a;
        a[0] = -10.0;

        System.out.println(b[0]);


    }

}
