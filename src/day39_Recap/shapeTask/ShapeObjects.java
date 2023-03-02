package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square("Square", 10);
        square.setSide(20);
        System.out.println(square);

        System.out.println("--------------------");

        Rectangle rectangle = new Rectangle("Rectangle", 10, 20);
        rectangle.setLength(30);
        System.out.println(rectangle);
        System.out.println(rectangle.getLength());

        System.out.println("--------------------------");

        Circle circle=new Circle("Circle",20);
        System.out.println(circle);

    }
}
