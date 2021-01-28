public class IntOps {
    public static void main(String[] args) {

//       Integer is a wrapper class of int
//        it has many utility class methods for example
//        the parseInt method is used to parse integer out of a string

        System.out.println("123" + 1 );
        System.out.println(Integer.parseInt("123") + 1);

        System.out.println(Double.parseDouble("123.0") + 1);

        System.out.println(Math.sqrt(-1));

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
    }
}