import stdlib.StdIn;
import stdlib.StdOut;

//Read two integers form stdin and print to stdout with bigger at front
public class SwapInts {
    public static void main(String[] args) {

        int a = StdIn.readInt();
        int b = StdIn.readInt();

        if (a < b)    {
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
        }
        StdOut.println(a);
        StdOut.println(b);

    }
}
