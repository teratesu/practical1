package practice06;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(10, 10, 2, 3);
        System.out.println("До перемещения: " + point);
        point.moveRight();
        point.moveDown();
        System.out.println("После перемещения: " + point);

        MovableCircle circle = new MovableCircle(20, 20, 5, 5, 10);
        System.out.println();
        System.out.println("До перемещения: " + circle);
        circle.moveLeft();
        circle.moveUp();
        System.out.println("После перемещения: " + circle);
    }
}
