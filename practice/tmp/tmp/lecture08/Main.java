package lecture08;

/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
abstract class AbstractShape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
class ARectangle extends AbstractShape {
    private double width, height;
    public ARectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height; }
    @Override
    public double getPerimeter() { return 2 * (width + height); }
}

class ACircle extends AbstractShape {
    private double radius;
    public ACircle(double radius) { this.radius = radius; }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}



public class Main {
    public static void main(String[] args) {
        AbstractShape[] shapes = new AbstractShape[2];

        shapes[0] = new ARectangle(100, 50);
        shapes[1] = new ACircle(50);
        // 버전 1 코드
        for (AbstractShape shape : shapes) {
            if (shape instanceof ARectangle) {
                ARectangle ar = (ARectangle) shape;
                System.out.printf("%s area: %.2f\n",
                        ar.getClass(), ar.getArea());
            }
            else if (shape instanceof ACircle) {
                ACircle ac = (ACircle) shape;
                System.out.printf("%s area: %.2f\n",
                        ac.getClass(), ac.getArea());
            }
        }

        // 버전 2 코드
        for (AbstractShape shape : shapes) {
            System.out.printf("%s area: %.2f\n",
                    shape.getClass(), shape.getArea());
        }
    }
}
