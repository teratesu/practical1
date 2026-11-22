package practice04;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0, "red", true),
                new Rectangle(4.0, 6.0, "blue", false),
                new Square(3.0, "green", true)
        };

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.println(shape);
            System.out.printf("Площадь: %.2f%n", shape.getArea());
            System.out.printf("Периметр: %.2f%n", shape.getPerimeter());
            System.out.println();
        }
    }
}
