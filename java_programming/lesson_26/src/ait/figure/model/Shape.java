package ait.figure.model;

public abstract class Shape {
    protected double fieldSide;

    public Shape(double fieldSide) {
        this.fieldSide = fieldSide;
    }

    public double getFieldSide() {
        return fieldSide;
    }

    public void setFieldSide(double fieldSide) {
        this.fieldSide = fieldSide;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("fieldSide=").append(fieldSide);
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append(", area=").append(calcArea());
        sb.append('}');
        return sb.toString();
    }
}
