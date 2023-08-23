package ait.figure.model;

public class Triangle extends Shape {
    public Triangle(double fieldSide) {
        super(fieldSide);
    }

    @Override
    public double calcArea() {
        return Math.sqrt(3.0) / 4 * fieldSide * fieldSide;
    }

    @Override
    public double calcPerimeter() {
        return 3 * fieldSide;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangle");
        sb.append(super.toString());
        return sb.toString();
    }
}
