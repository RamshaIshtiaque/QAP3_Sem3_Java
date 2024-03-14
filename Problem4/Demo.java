package Problem4;

public class Demo {
    public static void main(String[] args) {
        Shape[] beforeScalingShapes = new Shape[4];
        beforeScalingShapes[0] = new Ellipse("Ellipse", 5, 3);
        beforeScalingShapes[1] = new Circle("Circle", 4);
        beforeScalingShapes[2] = new Triangle("Triangle", 3, 4, 5); // Valid Triangle
        beforeScalingShapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        System.out.println("Before scaling:");
        for (Shape shape : beforeScalingShapes) {
            System.out.println(shape.toString());
        }

        Shape[] afterScalingShapes = new Shape[4];
        Ellipse ellipse = new Ellipse("Ellipse" , 5, 3);
        ellipse.scale(2);
        afterScalingShapes[0] = ellipse;

        afterScalingShapes[1] = new Circle("Circle", 4);

        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        triangle.scale(2);
        afterScalingShapes[2] = triangle;

        afterScalingShapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        System.out.println("After scaling:");
        for (Shape shape : afterScalingShapes) {
            System.out.println(shape.toString());
        }
    }
}

