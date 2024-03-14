package Problem4;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public void scale(int factor) {
        majorAxis = factor * majorAxis;
        minorAxis = factor * minorAxis;
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
