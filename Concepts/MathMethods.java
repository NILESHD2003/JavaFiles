package Concepts;

public class MathMethods {
    public static void main(String[] args) {
        double x=2.6,y=3.7;

        System.out.println(Math.pow(x,y));

        System.out.println(Math.sqrt(x));

        System.out.println(Math.cbrt(y));

        System.out.println(Math.negateExact((int)x));

        System.out.println(Math.max((int)x,(int)y));

        System.out.println(Math.ceil(x));

        System.out.println(Math.floor(y));

        System.out.println(Math.log(x));

        System.out.println(Math.rint(x));

        System.out.println((int)(Math.random()*201));
    }
}
