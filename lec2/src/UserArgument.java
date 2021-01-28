
/*
*
*   Commandline Argument:
*
*       args: is a string array. it stores all commandline argument separated by space such args[0] is first argument and etc.
*
* */

public class UserArgument {

    public static void main(String[] args) {
        System.out.println(args[0]);

        AddTwoInts sum0f2 = new AddTwoInts(2, 3);


        System.out.println(sum0f2.a);
        System.out.println(sum0f2.sum());

    }
}
