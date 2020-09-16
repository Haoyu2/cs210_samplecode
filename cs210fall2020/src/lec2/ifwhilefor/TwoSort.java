package lec2.ifwhilefor;

public class TwoSort
{
    public static void main(String[] args)
    {

        if (args.length==0) args = new String[]{"3", "2"};
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (b < a)
        {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
