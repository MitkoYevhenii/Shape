package ua.goit.shape.list;

import ua.goit.shape.Shape;

public class Quad extends Shape {
    private final double size;

    public Quad(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String shapeName() {
        return "Quad";
    }

    @Override
    public double area() {
        return Math.pow(size, 2);
    }

    @Override
    public String toString() {
        return "Quad{" +
                "size=" + size +
                '}';
    }
}
