package ua.goit.shape.list;

import ua.goit.shape.Shape;

public class Rectangle extends Shape {
    private final double firstSize;
    private final double secondSize;

    public Rectangle(double firstSize, double secondSize) {
        this.firstSize = firstSize;
        this.secondSize = secondSize;
    }

    public double getFirstSize() {
        return firstSize;
    }

    public double getSecondSize() {
        return secondSize;
    }

    @Override
    public String shapeName() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return firstSize * secondSize;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstSize=" + firstSize +
                ", secondSize=" + secondSize +
                '}';
    }
}
