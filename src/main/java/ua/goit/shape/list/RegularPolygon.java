package ua.goit.shape.list;

import ua.goit.shape.Shape;

public class RegularPolygon extends Shape {
    private final int numberOfSides;
    private final double sideLength;

    public RegularPolygon(int numberOfSides, double sideLength) {
        if (numberOfSides < 3) {
            throw new IllegalArgumentException("A polygon must have at least 3 sides.");
        }
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public String shapeName() {
        return "RegularPolygon";
    }

    @Override
    public double area() {
        return (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

    }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "numberOfSides=" + numberOfSides +
                ", sideLength=" + sideLength +
                '}';
    }
}
