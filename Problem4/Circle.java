package Problem4;

public class Circle  extends Ellipse{
    double radius;

    public Circle(String name, double radius) {
        super(name, radius, radius);
        this.radius = radius;
    }
    @Override
    public void scale(int factor) {
        radius = radius * factor;
        super.scale(factor);
        
    }
}
