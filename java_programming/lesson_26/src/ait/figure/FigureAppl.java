package ait.figure;

import ait.figure.model.Circle;
import ait.figure.model.Shape;
import ait.figure.model.Square;
import ait.figure.model.Triangle;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3);
        shapes[1] = new Circle(5);
        shapes[2] = new Triangle(4.5);
        shapes[3] = new Square(7);

        System.out.printf("Total area of all figures: %.2f\n", getTotalArea(shapes));
        System.out.printf("Total perimeter of all figures: %.2f\n", getTotalPerimeter(shapes));
        System.out.printf("Total area of all circles: %.2f\n", getTotalCircleArea(shapes));
    }

    private static double getTotalArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {

                sum += shapes[i].calcArea();
            }
        }
        return sum;
    }

    private static double getTotalPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {

                sum += shapes[i].calcPerimeter();
            }
        }
        return sum;
    }

    private static double getTotalCircleArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null && shapes[i] instanceof Circle) {
                sum += shapes[i].calcArea();
            }
        }
        return sum;
    }
}
