package Problem4;

public abstract class Shape implements Scaleable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return "Name: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
