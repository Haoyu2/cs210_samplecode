import stdlib.StdIn;
import stdlib.StdOut;

/*
*   1. redirection in operator < (redirecion out operator > and >>)
*
*
*
*
* */
public class StdInDemo {
    public static void main(String[] args) {

//        This loop will read all the integers from stdin and print out to stdout
        while (!StdIn.isEmpty()){

            StdOut.println(StdIn.readInt());
        }

    }
}
