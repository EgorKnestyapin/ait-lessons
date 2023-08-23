package ait.figure.model;

public class Square extends Shape {
    public Square(double fieldSide) {
        super(fieldSide);
    }

    @Override
    public double calcArea() {
        return fieldSide * fieldSide;
    }

    @Override
    public double calcPerimeter() {
        return 4 * fieldSide;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square");
        sb.append(super.toString());
        return sb.toString();
    }
}
