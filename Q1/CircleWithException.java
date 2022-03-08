public class CircleWithException {
    private static final double PI = 3.14159265359;
    private double radius;
    private double diameter;
    private double area;

    public CircleWithException(double radius) throws Exception {
        setRadius(radius);
        setArea();
        setDiameter();
    }

    public double getArea() {
        return area;
    }

    public void setArea() throws Exception {
        area = PI * radius * radius;
        if (area > 1000) {
            throw new Exception("Radius should be smaller.");
        }
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter() {
        diameter = 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException();
        } else {
            this.radius = radius;
        }
    }
}