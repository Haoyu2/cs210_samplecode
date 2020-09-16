package lec1.bpc;

public class TyepCon {
    public static void main(String[] args) {

        int aa = Integer.parseInt("123");
        double bb = Double.parseDouble("3.14");

        System.out.println();
/*
*   D
* */
        System.out.printf("3 / 2 : %d\n", 3 / 2 );
        // 1.5 implicit typecasting from double to int the fraction will be discarded
        System.out.printf("- 3 / 2 : %d\n", -3 /2 );
        System.out.printf("3 / (-2) : %d\n", 3 / (-2) );
        System.out.printf("- 3 / (-2) : %d\n", -3 / (-2) );


        System.out.printf("Math.ceil(3 / 2) : %d\n", (int) Math.ceil(3.0 / 2) );//1.5 ceiling 2.0  => 3
        System.out.printf("Math.ceil(-3 / 2) : %d\n", (int) Math.ceil(-3.0 /2) ); // -1.5 -> -1.0 => -1


        System.out.printf("Math.floor(3 / 2) : %d\n", (int) Math.floor(3.0 /2) );// 1.5 floor 1.0  1
        System.out.printf("Math.floor(-3 / 2) : %d\n", (int) Math.floor(-3.0 /2) );// -1.5  -2.0  2


        System.out.println("WoW" + 2);

    }
}
