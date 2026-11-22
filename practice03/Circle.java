package practice03;

public class Circle {
    private Point center;
    private double radius;
    private double length;

    public Circle(Point center, double radius) {
        this.center = center;
        setRadius(radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.length = 2 * Math.PI * radius;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + ", length=" + length + "]";
    }
}
