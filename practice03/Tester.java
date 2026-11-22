package practice03;

import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0) {
            return null;
        }

        Circle smallest = circles[0];

        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }

        return smallest;
    }

    public Circle findLargestCircle() {
        if (count == 0) {
            return null;
        }

        Circle largest = circles[0];

        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }

        return largest;
    }

    public void sortByRadius() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Tester tester = new Tester(5);

        for (int i = 0; i < 5; i++) {
            double x = random.nextDouble() * 10;
            double y = random.nextDouble() * 10;
            double radius = random.nextDouble() * 9 + 1;
            tester.addCircle(new Circle(new Point(x, y), radius));
        }

        System.out.println("Все окружности:");
        tester.printCircles();

        System.out.println();
        System.out.println("Самая маленькая: " + tester.findSmallestCircle());
        System.out.println("Самая большая: " + tester.findLargestCircle());

        tester.sortByRadius();
        System.out.println();
        System.out.println("После сортировки по радиусу:");
        tester.printCircles();
    }
}
