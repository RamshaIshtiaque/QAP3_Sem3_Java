package Problem3;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * (majorAxis + minorAxis) - Math.sqrt((2 * majorAxis - minorAxis) * (2 * minorAxis - majorAxis)));
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}
