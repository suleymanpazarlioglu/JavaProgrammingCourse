package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(100/3);
        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a=6;
        double b=100/a;

        System.out.println(b);

        int x=6;
        double y=(double) 100/x;

        System.out.println(y);

    }
}
