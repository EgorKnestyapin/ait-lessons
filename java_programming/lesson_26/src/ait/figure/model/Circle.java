package ait.figure.model;

public class Circle extends Shape {
    public Circle(double fieldSide) {
        super(fieldSide);
    }

    @Override
    public double calcArea() {
        return Math.PI * fieldSide * fieldSide;

    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * fieldSide;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle");
        sb.append(super.toString());
        return sb.toString();
    }
}
