package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double radius=4.2;
        double pi=3.14;
        double diameter=radius*2;
        double area=radius*radius*pi;
        double perimeter=2*pi*radius;

        System.out.println("radius = " + radius);
        System.out.println("pi = " + pi);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
