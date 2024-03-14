package Problem3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Ellipse("Ellipse", 5, 3);
        shapes[1] = new Circle("Circle", 4);
        shapes[2] = new Triangle("Triangle", 3, 4, 5); // Valid Triangle
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
