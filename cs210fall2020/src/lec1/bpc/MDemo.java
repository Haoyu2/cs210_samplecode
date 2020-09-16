package lec1.bpc;

public class MDemo {
    public static void main(String[] args) {

        // Parse coefficients from command-line.
//        PI radian = 180 degree Math.sin taking radian instead of degree
        System.out.printf("Math.sin(90): %f\n", Math.sin(90));
        System.out.printf("Math.sin(Math.toRadians(90)): %f\n", Math.sin(Math.toRadians(90)));
        System.out.printf("Math.sin(Math.PI): %f\n", Math.sin(Math.PI));
        System.out.printf("Math.cos(Math.PI): %f\n", Math.cos(Math.PI));



        System.out.printf("Math.sqrt(-1): %f\n", Math.sqrt(-1));

        if (args.length==0) args = new String[]{"2", "1"};

        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        // Calculate roots of x*x + b*x + c.
        double discriminant = b*b - 4.0*c;
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d) / 2.0;
        double root2 = (-b - d) / 2.0;
        // Print them out.
        System.out.println(root1);
        System.out.println(root2);
    }

}
