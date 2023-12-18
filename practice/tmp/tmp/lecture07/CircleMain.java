package lecture07;

import java.awt.*;

class CircleHasAPoint {
    private Point center;
    private double radius;

    public CircleHasAPoint() {}
    public CircleHasAPoint(Point p, double r) {
        center = p;
        this.radius = r;
    }
    public CircleHasAPoint(int x, int y, double r) {
        center = new Point(x, y);
        this.radius = r;
    }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}

public class CircleMain {

    public static void main(String[] args) {
        CircleHasAPoint myCircle = new CircleHasAPoint(10, 10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("원 면적: %.2f\n", myArea);
        System.out.printf("원 둘레: %.2f\n", myCircumference);
    }

}
